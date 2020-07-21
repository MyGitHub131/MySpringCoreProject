package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.AccerLaptop;
import com.alliswell.beans.DellLaptop;
import com.alliswell.beans.HpLaptop;
import com.alliswell.beans.LenoveLaptop;

public class Client {
	public static void main(String[] args) {
		/*DellLaptop lap = new DellLaptop();
		OS os = new OS();
		
		lap.setOs(os);
		os.windows10();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		System.out.println("application-context.xml file is loaded...");
		DellLaptop laptop = context.getBean("delllaptop", DellLaptop.class);
			laptop.windows10();
			
		HpLaptop hpLaptop = context.getBean("hplaptop", HpLaptop.class);
			hpLaptop.windows8();
			
		LenoveLaptop lenoveLaptop = context.getBean("lenovelaptop", LenoveLaptop.class);
			lenoveLaptop.windows7();
			
		AccerLaptop accerLaptop = context.getBean("accerlaptop", AccerLaptop.class);
			accerLaptop.windows9();
		
	}
}
