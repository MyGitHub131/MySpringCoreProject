package com.alliswell.beans;

public class Employee {
	private Project project = null;

	public void setProject(Project project) {
		this.project = project;
	}

	public void display_Employee() {
		project.display_Project();
	}
}
