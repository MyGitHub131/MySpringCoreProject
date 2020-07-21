package com.alliswell.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.alliswell.beans.GirlsMakeup;

public class GirlsTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		GirlsMakeup girlsMakeup = context.getBean("girls", GirlsMakeup.class);
		// System.out.println(girlsMakeup);
		girlsMakeup.displayGirlsMakeup();

		/*XmlBeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com/alliswell/common/application-context.xml"));
		GirlsMakeup girlsMakeup2 = factory.getBean("girls", GirlsMakeup.class);
		girlsMakeup2.displayGirlsMakeup();*/

	}

}
