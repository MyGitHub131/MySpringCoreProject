package com.alliswell.beans;

public class Bike {
	private String series_Id_No;
	private String company;
	private String model;
	private String functionailty;
	private String fuel;

	public void setSeries_Id_No(String series_Id_No) {
		this.series_Id_No = series_Id_No;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setFunctionailty(String functionailty) {
		this.functionailty = functionailty;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Bike [series_Id_No=" + series_Id_No + ", company=" + company
				+ ", model=" + model + ", functionailty=" + functionailty
				+ ", fuel=" + fuel + "]";
	}

	/*public void displayBikeDetails() {
		System.out.println("@@***BIKE FUNCTION DETAILS***@@");
		System.out.println("-------------------------------");
		System.out.println("Series_Id_No : " + series_Id_No);
		System.out.println("Company : " + company);
		System.out.println("Model : " + model);
		System.out.println("Functionailty : " + functionailty);
		System.out.println("Fuel : " + fuel);
	}*/

}
