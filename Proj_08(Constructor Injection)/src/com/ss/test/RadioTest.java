package com.ss.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ss.beans.Radio;

public class RadioTest {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/ss/common/application-context.xml"));
        System.out.println("Bean factory");       
		Radio radio=factory.getBean("radio",Radio.class);
		System.out.println("radio object");
        radio.listen();
        System.out.println("listen() called");
	}

}
