package com.fs.beans;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.fs.helper.AppFactory;

public class MessageWriter {
	private IMessageProducer messageProducer;

	public void setMessageProducer(IMessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	public void writeMessage(String message) throws FileNotFoundException, InstantiationException,
			IllegalAccessException, ClassNotFoundException, IOException {

		System.out.println(messageProducer.convertMessage(message));
	}

}
