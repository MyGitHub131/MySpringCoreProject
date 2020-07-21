package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.MonstarJobPortal;
import com.alliswell.beans.NaukriJobPortal;
import com.alliswell.beans.ShineJobPortal;

public class JobPortalTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		
		NaukriJobPortal naukriJobPortal = (NaukriJobPortal) context.getBean("naukri");
		naukriJobPortal.NaukriPortalActivate();
		
		ShineJobPortal shineJobPortal = (ShineJobPortal) context.getBean("shine");
		shineJobPortal.shinePortalActivate();
		
		MonstarJobPortal monstarJobPortal = (MonstarJobPortal) context.getBean("monstar");
		monstarJobPortal.monstarPortalActivate();
	}
}
