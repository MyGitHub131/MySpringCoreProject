package com.pdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pdi.beans.Person;

public class PDITest {

	public static void main(String[] args) {

		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/pdi/common/application-context.xml"));
		Person person=factory.getBean("person",Person.class);
		System.out.println(person);
	}

}
