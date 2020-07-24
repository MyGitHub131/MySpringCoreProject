package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.College;

public class CollegeTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		College college = ctx.getBean("college", College.class);
		System.out.println(college);
	}
}
