package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Car;

public class TravelerCarTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/alliswell/common/application-context.xml");
		Car car = ctx.getBean("car", Car.class);
		car.startedCar();

	}
}