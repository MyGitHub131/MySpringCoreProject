package com.fs.beans;

public class HtmlMessageProducerImpl implements IMessageProducer {

	@Override
	public String convertmessage(String message) {

		return "<html><body>" + message + "</body></html>";
	}
}
