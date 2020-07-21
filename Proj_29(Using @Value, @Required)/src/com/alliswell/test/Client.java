package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Student;

public class Client {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		Student student = ctx.getBean("student", Student.class);
		student.displayStudentInfo();
		
	/*	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/alliswell/common/application-context.xml"));
		Student s1 = factory.getBean("student", Student.class);
		s1.displayStudentInfo();*/
		
	}
}







