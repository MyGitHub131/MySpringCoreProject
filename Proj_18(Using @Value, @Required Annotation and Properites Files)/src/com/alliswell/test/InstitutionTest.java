package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Student;

public class InstitutionTest {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			Student student = context.getBean("student", Student.class);
				student.displayStudentInformation();
		
	}
}
