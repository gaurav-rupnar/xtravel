/*package com.amadeus.java;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.amadeus.xml.vlsslq_06_1_1a.SecurityAuthenticate;
import com.amadeus.xml.vlsslq_06_1_1a.SecurityAuthenticate.DutyCode;
import com.amadeus.xml.vlsslq_06_1_1a.SecurityAuthenticate.DutyCode.DutyCodeDetails;
import com.amadeus.xml.vlsslq_06_1_1a.SecurityAuthenticate.PasswordInfo;
import com.amadeus.xml.vlsslq_06_1_1a.SecurityAuthenticate.SystemDetails;
import com.amadeus.xml.vlsslq_06_1_1a.SecurityAuthenticate.UserIdentifier;
import com.amadeus.xml.vlsslr_06_1_1a.SecurityAuthenticateReply;


public class Main {

	public static void main(String[] args) throws Exception {


		
		UserIdentifier ui = new UserIdentifier();
		ui.setOriginator("WS1APOC");
		ui.setOriginatorTypeCode("U");
		SecurityAuthenticate.UserIdentifier.OriginIdentification originident = new SecurityAuthenticate.UserIdentifier.OriginIdentification();
		originident.setSourceOffice("NCEP02001");
		ui.setOriginIdentification(originident);

		DutyCode dutyCode = new DutyCode();
		DutyCodeDetails dutyCodeDetails = new DutyCodeDetails();
		dutyCodeDetails.setReferenceIdentifier("SU");
		dutyCodeDetails.setReferenceQualifier("DUT");
		dutyCode.setDutyCodeDetails(dutyCodeDetails);

		SystemDetails systemDetails = new SystemDetails();

		PasswordInfo pi = new PasswordInfo();
		pi.setBinaryData("MnJPRWJyaSZXb1V0");
		BigDecimal bi = new BigDecimal("12");
		pi.setDataLength(bi);
		pi.setDataType("E");

		javax.xml.ws.Holder<SessionType> session = new javax.xml.ws.Holder<SessionType>();

		SecurityAuthenticate authenticate_request = new SecurityAuthenticate();
		authenticate_request.setDutyCode(dutyCode);
		authenticate_request.setSystemDetails(systemDetails);
		authenticate_request.getPasswordInfo().add(pi);
		authenticate_request.getUserIdentifier().add(ui);

		// Version with TFL
		//SecurityAuthenticateReply authenticate_reply = awspt.securityAuthenticate(authenticate_request, session, tfl);
		// Version without TFL
		SecurityAuthenticateReply authenticate_reply = awspt.securityAuthenticate(authenticate_request, session); 
		String sessionID = session.value.SessionID;

	}

}
*/