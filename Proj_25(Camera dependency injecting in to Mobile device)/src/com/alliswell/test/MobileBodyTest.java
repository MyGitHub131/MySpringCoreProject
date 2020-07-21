package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.MobileDevice;

public class MobileBodyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			MobileDevice mobileDevice = context.getBean("mobileDevice",MobileDevice.class);
			mobileDevice.cameraModeActivate();
	}
}
