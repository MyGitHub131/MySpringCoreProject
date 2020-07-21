package com.alliswell.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.alliswell.beans.Airtel;
import com.alliswell.beans.ISim;
import com.alliswell.beans.Vodaphone;


public class MobileTesting {
	public static void main(String[] args) {
		
		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com/alliswell/common/application-context.xml"));
			/*Airtel airtel =(Airtel) factory.getBean("airtel");
				airtel.calling();
				airtel.data();*/
		
			/*Vodaphone vodaphone =(Vodaphone) factory.getBean("vodaphone");
				vodaphone.calling();
				vodaphone.data();*/
		
			/*Sim sim =(Sim) factory.getBean("sim");
				sim.calling();
				sim.data();*/
				
			/*Sim sim = factory.getBean("sim", Vodaphone.class);
				sim.calling();
				sim.data();*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			ISim sim = ctx.getBean("sim", Airtel.class);
				sim.calling();
				sim.data();
		
	}
}
