package com.amadeus.java.handlers;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.soap.AddressingFeature;

import com.amadeus.xml.AmadeusWebServices;
import com.amadeus.xml.AmadeusWebServicesPT;
import com.amadeus.xml.fmptbq_14_3_1a.FareMasterPricerTravelBoardSearch;
import com.amadeus.xml.fmptbr_14_3_1a.FareMasterPricerTravelBoardSearchReply;

/**
 * Amadeus Web Services handler
 */
public class ServiceHandler {

	private AmadeusWebServicesPT mPort;
	private SessionHandler mSession;
	private TransactionFlowLinkHandler mLink;
	private SecurityHandler mSecurity;
	private AddressingHandler mAddressing;
	private CustomSOAPHandler mSoapHandler = new CustomSOAPHandler();

	public ServiceHandler(String WSAP) throws Exception {
		AmadeusWebServices proxy = new AmadeusWebServices();
		mPort = proxy.getAmadeusWebServicesPort(new AddressingFeature());
		mSecurity = new SecurityHandler((BindingProvider) mPort, mSoapHandler);
		mSession = new SessionHandler((BindingProvider) mPort, mSecurity);
		mLink = new TransactionFlowLinkHandler((BindingProvider) mPort);
		mAddressing = new AddressingHandler((BindingProvider) mPort, WSAP);

		// Add a handler to manage security header and remove optional SOAP headers
		@SuppressWarnings("rawtypes")
		List<Handler> chain = new ArrayList<Handler>();
		chain.add(mSoapHandler);
		((BindingProvider) mPort).getBinding().setHandlerChain(chain);

	}

	public FareMasterPricerTravelBoardSearchReply masterFligthSearch(FareMasterPricerTravelBoardSearch searchReq,int transactionStatusCode, int linkStatusCode)
			throws Exception {
		mSession.handleSessionStatus(transactionStatusCode);
		mLink.handleLinkAction(linkStatusCode);
		mAddressing.update();

		
		FareMasterPricerTravelBoardSearchReply response = mPort.fareMasterPricerTravelBoardSearch(searchReq, mSession.getSession(), mLink.getLink(),
				mSecurity.getHostedUser());
		
		
		return response;

		
	}
	
	public void setWSAP(String WSAP) {
		mAddressing.setWSAP(WSAP);
	}

	public String getWSAP() {
		return mAddressing.getWSAP();
	}

}
