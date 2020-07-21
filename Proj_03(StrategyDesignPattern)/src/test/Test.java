package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.fs.beans.IMessageProducer;
import com.fs.beans.MessageWriter;

public class Test {
	public static void main(String[] args) {
		IMessageProducer messageproducer = null;
		MessageWriter messageWriter = null;
		// locate spring bean configuration file
		FileSystemResource res = new FileSystemResource("src/com/fs/commons/application-context.xml");
		// read and create obj
		BeanFactory factory = new XmlBeanFactory(res);

		messageWriter = (MessageWriter) factory.getBean("messagewriter");
		messageproducer = (IMessageProducer) factory.getBean("htmlmessageproducer");
		messageWriter.setMessageproducer(messageproducer);
		messageWriter.writemessage("Spring");
	}

}
