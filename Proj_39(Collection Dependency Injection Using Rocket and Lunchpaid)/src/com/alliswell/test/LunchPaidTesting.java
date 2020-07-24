package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.LunchPaid;

public class LunchPaidTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		LunchPaid lunchPaid = ctx.getBean("lunchPaid", LunchPaid.class);
		System.out.println(lunchPaid);
	}
}
