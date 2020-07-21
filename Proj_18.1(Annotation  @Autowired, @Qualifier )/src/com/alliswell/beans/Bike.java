package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class Bike {
	
	@Value("${Bike.id_no}")
	private int id_no;
	@Value("${Bike.name}")
	private String name;
	@Value("${Bike.brand}")
	private String brand;
	@Value("${Bike.color}")
	private String color;

	/*@Value("${Bike.id_no}")
	public void setId_no(int id_no) {
		this.id_no = id_no;
	}

	@Value("${Bike.name}")
	public void setName(String name) {
		this.name = name;
	}

	@Value("${Bike.brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Value("${Bike.color}")
	public void setColor(String color) {
		this.color = color;
	}*/

	public void displayInfo() {
		System.out.println("@@***Bike Information Details***@@");
		System.out.println("----------------------------------");
		System.out.println("Bike id_no : " + id_no);
		System.out.println("Bike name : " + name);
		System.out.println("Bike brand : " + brand);
		System.out.println("Bike color : " + color);
	}
}
