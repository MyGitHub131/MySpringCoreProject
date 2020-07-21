package com.cdi.beans;

import java.util.List;
import java.util.Set;

import org.apache.commons.collections.set.SynchronizedSet;

public class Course {
	private List<String> subjects;
	private Set<String> faculties;

	public void displayCourse() {
		System.out.println("Subjects Details : " + subjects);
		System.out.println("Faculties Details : " + faculties);
	}

	public void setFaculties(Set<String> faculties) {
		this.faculties = faculties;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

}
