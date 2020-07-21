package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	String name;

	@Value("${student.address}")
	String address;

	@Value("${student.interestedCourse}")
	String interestedCourse;

	@Value("${student.hobby}")
	String hobby;

	@Value("${student.bop}")
	String bop;

	public void displayStudentInfo() {
		System.out.println("Name : " + name);
		System.out.println("Address : " + address);
		System.out.println("Interested Course : " + interestedCourse);
		System.out.println("Hobby : " + hobby);
		System.out.println("Birth Of Place : " + bop);
	}
}
