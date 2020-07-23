package com.fs.beans;

public class PdfMessageProducerImpl implements IMessageProducer {

	public String convertMessage(String message) {
		return "<pdf>" + message + "</pdf>";
	}

}
