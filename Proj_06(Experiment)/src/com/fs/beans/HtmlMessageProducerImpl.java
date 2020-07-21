package com.fs.beans;

public class HtmlMessageProducerImpl implements IMessageProducer{

	
	//Alt+shift+s+v+enter
	public String convertMessage(String message) {
		return "<html><body>" +message+ "</body></html>";
	}


	

}
