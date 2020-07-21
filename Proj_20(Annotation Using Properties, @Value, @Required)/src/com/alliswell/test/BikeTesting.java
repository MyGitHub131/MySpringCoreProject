package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Bike;

public class BikeTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			Bike bike = context.getBean("bike", Bike.class);
			System.out.println(bike);
			//bike.displayBikeDetails();
	}
}
