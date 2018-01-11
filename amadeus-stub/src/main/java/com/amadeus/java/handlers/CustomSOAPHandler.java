package com.amadeus.java.handlers;

import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.log4j.Logger;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.message.WSSecHeader;
import org.apache.ws.security.message.WSSecUsernameToken;
import org.apache.ws.security.util.Base64;
import org.w3c.dom.Document;


/**
 * SOAP Handler used to manage security header and remove optional SOAP headers
 */
public class CustomSOAPHandler implements SOAPHandler<SOAPMessageContext> {

	private static final Logger logger = Logger.getLogger(CustomSOAPHandler.class);
	private boolean mIsSecurityEnabled = false;

	public Set<QName> getHeaders() {
		return null;
	}

	public void close(MessageContext arg0) {
	}

	public boolean handleFault(SOAPMessageContext arg0) {
		return true;
	}
	
	public void IsSecurityEnabled(boolean enabled){
		mIsSecurityEnabled = enabled;		
	}

	public boolean handleMessage(SOAPMessageContext context) {
		
		if (Boolean.TRUE.equals(context
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY))) {
			try {
				
				//--
				//-- ADD SECURITY HEADER
				//--
				if (mIsSecurityEnabled)
				{
					BuildSecurityHeader(context, "WSNLSAWB", "AgbcD3aj");					
				}
				
				//-- REMOVE OPTIONAL SOAP HEADERS
				// See Issue http://java.net/jira/browse/JAX_WS-1079 for further details
				//--
				SOAPMessage soapMsg = context.getMessage();
				System.out.println(soapMsg.getSOAPHeader().toString());
				System.out.println(soapMsg.toString());
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();
				Iterator<?> iterator = soapHeader.examineAllHeaderElements();
				
				QName sessionQName = new QName(
						"http://xml.amadeus.com/2010/06/Session_v3", "Session");
				QName securityQName = new QName(
						"http://xml.amadeus.com/2010/06/Security_v1", "AMA_SecurityHostedUser");
				QName linkQName = new QName(
						"http://wsdl.amadeus.com/2010/06/ws/Link_v1", "TransactionFlowLink");
				for (; iterator.hasNext();) {
					SOAPHeaderElement header = (SOAPHeaderElement) iterator.next();					
					
					if ( !header.hasChildNodes() && (
							header.getElementQName().equals(securityQName)
							|| header.getElementQName().equals(linkQName)
							|| (header.getElementQName().equals(sessionQName)
									&& !header.hasAttribute("TransactionStatusCode"))
						)) {
						logger.debug("Remove " + header.getElementQName().getLocalPart());
						soapHeader.removeChild(header);
					}
				}

				
				
				File file= new File("C:\\Data\\code\\Insta\\soapmessage.txt");
			    file.createNewFile();
			    FileOutputStream fileOutputStream = new FileOutputStream(file);
			    soapMsg.writeTo(fileOutputStream);
			    fileOutputStream.flush();
			    fileOutputStream.close();

			   //System.exit(0);
			} catch (Exception e) {
				System.err.println(e);
				return false;
			}
		}


		return true;
	}
	
	/**
	 * Build the WS-Security SOAP Header
	 * @param context the message context
	 * @throws Exception
	 */
	static private void BuildSecurityHeader(SOAPMessageContext context, String username, String password)
			throws Exception
	{
		// Auto-generate the WS-Security Header using WSS4J
		String passwordEncoded = Base64.encode(MessageDigest.getInstance("SHA-1").digest(password.getBytes()));
		WSSecUsernameToken builder = new WSSecUsernameToken();
        builder.setPasswordType(WSConstants.PASSWORD_DIGEST);
        builder.setPasswordsAreEncoded(true);
		//builder.setPasswordsAreEncoded(false);
       // builder.addNonce();
       // builder.addCreated();
        
        builder.setUserInfo( username, passwordEncoded);        
        Document doc = context.getMessage().getSOAPPart().getEnvelope().getOwnerDocument();
        WSSecHeader secHeader = new WSSecHeader();
        secHeader.insertSecurityHeader(doc);
        builder.build(doc, secHeader);
	}

}
