package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.AirtelSim;
import com.alliswell.beans.JioSim;

public class MobileTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		AirtelSim airtelSim = context.getBean("airtelSim", AirtelSim.class);
			airtelSim.activateService();
			
		JioSim jioSim = context.getBean("jioSim", JioSim.class);
			jioSim.activateService1();
	}
}
