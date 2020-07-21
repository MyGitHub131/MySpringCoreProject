package com.alliswell.beans;

public class PressureCookers {
	private int serial_no;
	private String company;
	private String model;
	private String weight;
	private String warranty_period;
	private String cost;

	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setWarranty_period(String warranty_period) {
		this.warranty_period = warranty_period;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public void displayPressureCoockersDetails() {
		System.out.println("@@***Pressure Coockers Detaisl***@");
		System.out.println("----------------------------------");
		System.out.println("Pressure Coockers Serial_No : " + serial_no);
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
		System.out.println("Weight : " + weight);
		System.out.println("Warranty_Period : " + warranty_period);
		System.out.println("Cost : " + cost);
	}
}
