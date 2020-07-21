package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Human;

public class BodyTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		Human human = ctx.getBean("human", Human.class);
		human.startPumping();
	}
}
