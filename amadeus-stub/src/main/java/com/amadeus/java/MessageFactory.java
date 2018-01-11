package com.amadeus.java;

import com.amadeus.xml.fmptbq_14_3_1a.FareMasterPricerTravelBoardSearch;
import com.amadeus.xml.vlssoq_04_1_1a.SecuritySignOut;

public class MessageFactory {

public static FareMasterPricerTravelBoardSearch buildFlightRequest() {
		
	FareMasterPricerTravelBoardSearch fareMasterPricerTravelBoardSearch143 = new FareMasterPricerTravelBoardSearch();

		return fareMasterPricerTravelBoardSearch143;				
	}

	public SecuritySignOut buildSignOutRequest() {
		com.amadeus.xml.vlssoq_04_1_1a.ObjectFactory factory = new com.amadeus.xml.vlssoq_04_1_1a.ObjectFactory();
		return factory.createSecuritySignOut();
	}

}
