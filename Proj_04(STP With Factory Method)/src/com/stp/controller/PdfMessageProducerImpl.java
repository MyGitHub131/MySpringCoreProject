package com.stp.controller;

public class PdfMessageProducerImpl implements IMessageProducer {

	@Override
	public String convertMessage(String message) {
		return "<pdf>" + message + "</pdf>";
		
	}

	/*public String convertMessage(String message) {
		return "<pdf>" + message + "</pdf>";
	}
*/
	
}
