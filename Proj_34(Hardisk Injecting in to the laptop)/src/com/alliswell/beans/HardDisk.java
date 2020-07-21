package com.alliswell.beans;

public class HardDisk {
	private int hardDisk_no;
	private String name;
	private String capacity;
	private String brand;
	private String warranty;

	public int getHardDisk_no() {
		return hardDisk_no;
	}

	public void setHardDisk_no(int hardDisk_no) {
		this.hardDisk_no = hardDisk_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public void displayHardDisk() {
		System.out.println("Your hard disk is working perfectly !!!");
		System.out.println("You can assembly hard disk now in your laptop !!!");
	}
}
