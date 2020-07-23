package com.alliswell.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.alliswell.beans.Restaurant;

public class RestaurantTesting {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory(
				new ClassPathResource("com/alliswell/common/application-context.xml"));
		Restaurant restaurant = factory.getBean("restaurant", Restaurant.class);
		restaurant.displayRestaurant();
	}
}
