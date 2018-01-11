package com.amadeus.java.handlers;


import javax.xml.ws.BindingProvider;
import org.apache.log4j.Logger;
import org.iata.iata._2007._00.iata2010.CompanyNameType;
import org.iata.iata._2007._00.iata2010.UniqueIDType;

import com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser;
import com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser.UserID;

/**
 * Manage Security
 * @since SOAP Header 4.0
 */
public class SecurityHandler extends HeaderHandler {

	/**
	 * <code>AMA_SecurityHostedUser</code> header
	 */
	private AMASecurityHostedUser mHostedUser;
	private CustomSOAPHandler mSoapHandler;

	private static final Logger logger = Logger
			.getLogger(SecurityHandler.class);

	/**
	 * Default constructor
	 * @param binding
	 * @param soapHandler
	 */
	public SecurityHandler(BindingProvider binding, CustomSOAPHandler soapHandler) {
		super(binding);
		mSoapHandler = soapHandler;
	}

	/**
	 * Fills the security headers
	 * <p>
	 * Adds the WS-Security header according to the policy and sets the
	 * <code>AMA_SecurityHostedUser</code> with the relevant values.
	 */
	public void fill() {
		addWSSecurity();
		setHostedUser();
	}

	/**
	 * Removes all the security headers
	 */
	public void reset() {
		mHostedUser = null;
		removeWSSecurity();
	}

	private void removeWSSecurity() {
		logger.debug("Remove WS-Security");
		mSoapHandler.IsSecurityEnabled(false);
	}

	private void addWSSecurity() {
		logger.debug("Add WS-Security");
		mSoapHandler.IsSecurityEnabled(true);
	}

	/**
	 * Adds the <code>AMA_SecurityHostedUser</code> header to the outgoing
	 * message.
	 * <p>
	 * Sets the following values:
	 * <ul>
	 * <li><b>Office ID</b> in the <code>PseudoCityCode</code> attribute</li>
	 * <li><b>Duty code</b> in the <code>AgentDutyCode</code> attribute</li>
	 * <li><b>RequestorType</b> to "U" as the LSS user is used</li>
	 * <li><b>Organization</b> in the <code>CompanyName</code> element</li>
	 * </ul>
	 */
	private void setHostedUser() {
		logger.debug("Set Security hosted user");
		com.amadeus.xml._2010._06.security_v1.ObjectFactory securityFactory = new com.amadeus.xml._2010._06.security_v1.ObjectFactory();
		mHostedUser = securityFactory.createAMASecurityHostedUser();
		UserID userId = securityFactory.createAMASecurityHostedUserUserID();
		userId.setRequestorType("U");
		userId.setPOSType("1");
		userId.setPseudoCityCode("YYCC4213S");
		mHostedUser.setUserID(userId);
		
	}

	/**
	 * Returns the container for <code>AMA_SecurityHostedUser</code> header
	 */
	public AMASecurityHostedUser getHostedUser() {
		return mHostedUser;
	}

}
