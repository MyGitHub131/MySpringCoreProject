package com.fs.beans;

public class HtmlMessageProducerImpl implements IMessageProducer {

	public String convertMessage(String message) {
		return "<html><body>" + message + "</body></html>";
	}

}
