package com.amadeus.java.handlers;

import javax.xml.ws.BindingProvider;

public abstract class HeaderHandler {

	protected BindingProvider mClient;
	
	public HeaderHandler(BindingProvider client) {
		mClient = client;
	}
}
