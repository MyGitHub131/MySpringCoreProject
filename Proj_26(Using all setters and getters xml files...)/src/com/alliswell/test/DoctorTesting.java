package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Doctor;

public class DoctorTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application_context.xml");
			Doctor doctor = ctx.getBean("doctor", Doctor.class);
			doctor.displayDoctorInfo();
			//System.out.println(doctor.displayDoctorInfo());
			//System.out.println(doctor);
			
	}
}
