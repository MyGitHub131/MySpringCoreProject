package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Mobile;

public class SimCardTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		Mobile mobile = context.getBean("mobile", Mobile.class);
		mobile.simCallingActivated();
	}
}


