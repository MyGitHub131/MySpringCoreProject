package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Student;

public class StudentTest {
	public static void main(String[] args) {
		
		/*XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/alliswell/common/application-context.xml"));
		Student student = factory.getBean("student", Student.class);
		student.cheatStarted();*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			Student student = ctx.getBean("student",Student.class);
			student.cheatStarted();
	}
}
