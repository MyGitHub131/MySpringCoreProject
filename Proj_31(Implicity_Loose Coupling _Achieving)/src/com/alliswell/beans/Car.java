package com.alliswell.beans;

public class Car {
	public Iwhieel iwhieel;
	public String name;
	public String model;
	public String fuel;
	public String gear;
	public String kmph;

	public Iwhieel getIwhieel() {
		return iwhieel;
	}

	public void setIwhieel(Iwhieel iwhieel) {
		this.iwhieel = iwhieel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getKmph() {
		return kmph;
	}

	public void setKmph(String kmph) {
		this.kmph = kmph;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public void startedCar() {
		iwhieel.rotate();
		System.out.println("Name : " + name + ", Model : " + model
				+ ", Fuel : " + fuel + ", Gear : " + gear + ", Kmph : " + kmph
				);
	}

}