package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Student;

public class Exam {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			Student bibhuti = ctx.getBean("student", Student.class);
			//System.out.println(student);
				bibhuti.displayStudentInfo();
				
			Student abinash = ctx.getBean("abinash", Student.class);
				abinash.displayStudentInfo();
			
	}
}
