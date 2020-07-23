package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Robot;

public class RobotTesting {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/annotation-context.xml");
		Robot robot = ctx.getBean("robot", Robot.class);
		System.out.println(robot);
	}
}