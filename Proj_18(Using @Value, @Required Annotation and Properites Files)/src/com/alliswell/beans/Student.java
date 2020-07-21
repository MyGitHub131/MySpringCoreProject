package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${Student.id}")
	private int id;
	@Value("${Student.name}")
	private String name;
	@Value("${Student.interestedCourse}")
	private String interestedCourse;
	@Value("${Student.hobby}")
	private String hobby;
	@Value("${Student.address}")
	private String address;

	public void displayStudentInformation() {
		System.out.println("@@***Student Information Details***@@");
		System.out.println("-------------------------------------");
		System.out.println("Student id : " + id);
		System.out.println("Student name : " + name);
		System.out.println("Student interestedCourse : " + interestedCourse);
		System.out.println("Student hobby : " + hobby);
		System.out.println("Student address : " + address);

	}

}
