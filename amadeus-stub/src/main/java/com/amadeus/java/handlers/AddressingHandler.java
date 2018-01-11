package com.amadeus.java.handlers;

import java.util.Map;
import javax.xml.ws.BindingProvider;

/**
 * This class allows to dynamically change the SAP, or to override the one defined into the wsdl
 */
public class AddressingHandler extends HeaderHandler {
	
	private String mWSAP;
	private String mAddress;	
	
	public AddressingHandler(BindingProvider binding, 
			String WSAP) {
		super(binding);
		mWSAP = WSAP;
		mAddress =  (String) binding.getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY);
		// remove the default wsap from address
		mAddress = mAddress.substring(0, mAddress.lastIndexOf('/'));
	}

	public void setWSAP(String WSAP) {
		mWSAP = WSAP;
	}
	
	public String getWSAP() {
		return mWSAP;
	}

	public void update() {
		setWSAP();		
	}

	private void setWSAP() {
		Map<String, Object> context = mClient.getRequestContext();
		context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, mAddress + "/" + mWSAP);
	}

}
