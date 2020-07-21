package com.stp.helper;

import com.stp.controller.HtmlMessageProducerImpl;
import com.stp.controller.IMessageProducer;
import com.stp.controller.PdfMessageProducerImpl;

public class MessageProducerFactory {
	public static IMessageProducer createMessage(String msgType)
	{
		IMessageProducer messageProducer=null;
		
		if(msgType.equalsIgnoreCase("Html"))
		{
		messageProducer=new HtmlMessageProducerImpl();
		}
		else if(msgType.equalsIgnoreCase("pdf"))
		{
		messageProducer=new PdfMessageProducerImpl();
		}
		return messageProducer;
		
	}

}
