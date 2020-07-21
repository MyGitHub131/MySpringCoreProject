package com.fs.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.HtmlMessageProducerImpl;
import com.fs.beans.IMessageProducer;
import com.fs.beans.MessageWriter;
import com.fs.beans.PdfMessageProducerImpl;
import com.fs.helper.AppFactory;

public class MessageProducerTest {
	
	public static void main(String[] args) throws FileNotFoundException, InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/fs/common/application-context.xml"));
		MessageWriter messageWriter=(MessageWriter) factory.getBean("messageWriter");
		IMessageProducer messageProducer=(IMessageProducer) factory.getBean("htmlMessageProducer");
	    messageWriter.setMessageProducer(messageProducer);
	    messageWriter.writeMessage("Hi......Bibhuti");
	}

}
