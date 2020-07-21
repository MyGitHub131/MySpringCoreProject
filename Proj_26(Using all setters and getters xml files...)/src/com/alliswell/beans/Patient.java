package com.alliswell.beans;

public class Patient {
	private String name;
	private int age;
	private String color;
	private double height;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", color=" + color
				+ ", height=" + height + "]";
	}

	/*Patient(String name, int age, String color, double height) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.height = height;
	}*/

/*	public String displayPatient() {
		return "patient[Name : " + name +  ", Age : " + age +  ", Color : " + color +  ", Height : " + height +"]";
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Color : " + color);
		System.out.println("Height : " + height);
	}*/

	
}
