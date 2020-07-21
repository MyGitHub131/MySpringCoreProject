package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.Employee;

public class EmployeeTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		Employee employee = context.getBean("employee", Employee.class);
		employee.displayEmployeeInfo();
		//System.out.println(employee);
	}
}