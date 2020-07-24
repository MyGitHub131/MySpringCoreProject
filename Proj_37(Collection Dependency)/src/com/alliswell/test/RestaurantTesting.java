package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Restaurant;

public class RestaurantTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		Restaurant restaurant = ctx.getBean("restaurant1", Restaurant.class);
		restaurant.greetCustomers();

	}
}
