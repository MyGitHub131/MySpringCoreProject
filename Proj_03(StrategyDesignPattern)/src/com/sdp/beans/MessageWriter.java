package com.sdp.beans;


public class MessageWriter {
	  IMessageProducer messageProducer;

	public void writeMessage(String message)
	{

		String cMessage=null;
		messageProducer=new HtmlMessageProducerImpl();
		//messageProducer=new PdfMessageProducerImpl();
		cMessage=messageProducer.convertMessage(message);
		System.out.println(cMessage);

		
	}


}
