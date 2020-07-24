package com.alliswell.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.alliswell.beans.Restaurant;

public class RestaurantTesting {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/alliswell/common/application-context.xml"));
		Restaurant restaurant1 = factory.getBean("restaurant1", Restaurant.class);
		Restaurant restaurant2 = factory.getBean("restaurant1", Restaurant.class);
		System.out.println("restaurant1 == restaurant2 ? : " + (restaurant1 == restaurant2));
		restaurant1.greetMessage();
	}
}
