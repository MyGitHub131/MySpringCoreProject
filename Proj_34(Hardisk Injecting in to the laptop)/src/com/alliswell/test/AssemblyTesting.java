package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Laptop;

public class AssemblyTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		Laptop laptop = ctx.getBean("laptop", Laptop.class);
		laptop.assemblyLaptop();

	}
}
