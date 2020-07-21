package com.fs.beans;

public class MessageWriter {
	IMessageProducer messageproducer;
	private String cMessage = null;

	public void writemessage(String message) {
		cMessage = messageproducer.convertmessage(message);
		System.out.println(cMessage);
	}

	public void setMessageproducer(IMessageProducer messageproducer) {
		this.messageproducer = messageproducer;
	}
}