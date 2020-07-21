package com.stp.test;


import java.io.IOException;

import com.stp.controller.HtmlMessageProducerImpl;
import com.stp.controller.IMessageProducer;
import com.stp.controller.MessageWriter;
import com.stp.controller.PdfMessageProducerImpl;

public class MessageProduceTest {

	public static void main(String[] args){
		
		MessageWriter messagewriter=null;
       
		messagewriter=new MessageWriter();
      
		messagewriter.writeMessage("Message Producer With Factory Method");
	}

}
