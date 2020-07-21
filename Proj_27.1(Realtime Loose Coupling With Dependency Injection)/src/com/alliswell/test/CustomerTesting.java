package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.AmazanEcomercePortal;
import com.alliswell.beans.FlipkartEcomercePortal;

public class CustomerTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		
			FlipkartEcomercePortal flipkartEcomercePortal = context.getBean("flipKartPortal", FlipkartEcomercePortal.class);
			flipkartEcomercePortal.activatedServiceFlipkartPortal();
			
			AmazanEcomercePortal amazanEcomercePortal = context.getBean("amazanPortal", AmazanEcomercePortal.class);
			amazanEcomercePortal.activatedServiceAmazanPortal();
	}
}
