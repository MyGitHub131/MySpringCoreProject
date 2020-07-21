package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Patient;


public class PatientTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			Patient patient = ctx.getBean("patient", Patient.class);
			//System.out.println(patient.displayPatient());
			System.out.println(patient);
			//patient.displayPatient();
			
	}
}
