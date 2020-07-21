package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Human;

public class BodyTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		Human human = context.getBean("human", Human.class);
			human.startPumping();
			
		/*XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/alliswell/common/application-context.xml"));
		Human human2 = factory.getBean("human", Human.class);
			human2.startPumping();*/
	}
}

