package com.fs.beans;

public class PdfMessageProducerImpl implements IMessageProducer {

	@Override
	public String convertmessage(String message) {
		
		return "<pdf>"+message+"</pdf>";
	}
	

}
