/*package com.amadeus.java;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.AddressingFeature;

import org.iata.iata._2007._00.iata2010.CompanyNameType;
import org.iata.iata._2007._00.iata2010.UniqueIDType;

import com.amadeus.xml.AmadeusWebServices;
import com.amadeus.xml.AmadeusWebServicesPT;
import com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser.UserID;
import com.amadeus.xml.fmptbq_14_3_1a.FareMasterPricerTravelBoardSearch;

public class ServiceTest1 {

	public static void main(String[] args) {

		AmadeusWebServices proxy = new AmadeusWebServices();
		AmadeusWebServicesPT mPort = proxy.getAmadeusWebServicesPort(new AddressingFeature());

		com.amadeus.xml._2010._06.security_v1.ObjectFactory securityFactory = new com.amadeus.xml._2010._06.security_v1.ObjectFactory();
		com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser mHostedUser = securityFactory
				.createAMASecurityHostedUser();

		mSoapHandler = new CustomSOAPHandler(username, password);
		mSecurity = new SecurityHandler((BindingProvider) mPort, mSoapHandler);
		mSession = new SessionHandler((BindingProvider) mPort, mSecurity);
		mLink = new TransactionFlowLinkHandler((BindingProvider) mPort);
		mAddressing = new AddressingHandler((BindingProvider) mPort, WSAP);

		// Add a handler to manage security header and remove optional SOAP headers
		@SuppressWarnings("rawtypes")
		List<Handler> chain = new ArrayList<Handler>();
		chain.add(mSoapHandler);
		((BindingProvider) mPort).getBinding().setHandlerChain(chain);

		UserID userId = securityFactory.createAMASecurityHostedUserUserID();
		userId.setAgentDutyCode("SU");
		userId.setRequestorType("U");
		userId.setPOSType("1");
		userId.setPseudoCityCode("1ASIWAWBNLS");
		org.iata.iata._2007._00.iata2010.ObjectFactory iataFactory = new org.iata.iata._2007._00.iata2010.ObjectFactory();
		UniqueIDType uniqueId = iataFactory.createUniqueIDType();
		CompanyNameType organization = iataFactory.createCompanyNameType();
		organization.setValue("1A");
		uniqueId.setCompanyName(organization);
		userId.setRequestorID(uniqueId);
		mHostedUser.setUserID(userId);

		FareMasterPricerTravelBoardSearch fareMasterPricerTravelBoardSearch143 = new FareMasterPricerTravelBoardSearch();
		mPort.fareMasterPricerTravelBoardSearch(fareMasterPricerTravelBoardSearch143, null, null, mHostedUser);
	}
}

*/