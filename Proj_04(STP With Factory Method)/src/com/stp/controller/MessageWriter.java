package com.stp.controller;

import com.stp.helper.MessageProducerFactory;

public class MessageWriter {
	private IMessageProducer messageProducer;

	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	public void writeMessage(String message)
	{
	String cMessage=null;
	//messageProducer=MessageProducerFactory.createMessage("Pdf");
    messageProducer=MessageProducerFactory.createMessage("html");

	cMessage=messageProducer.convertMessage(message);
	System.out.println(cMessage);
	}

}
