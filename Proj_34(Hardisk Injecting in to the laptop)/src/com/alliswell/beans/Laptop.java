package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Laptop {
	@Autowired
	@Qualifier("hardDisk02")
	private HardDisk hardDisk = null;

	/*public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}
*/
	public void assemblyLaptop() {
		if (hardDisk != null) {
			hardDisk.displayHardDisk();
			System.out.println("Hardisk_No : " + hardDisk.getHardDisk_no());
			System.out.println("Name : " + hardDisk.getName());
			System.out.println("Capacity : " + hardDisk.getCapacity());
			System.out.println("Brand : " + hardDisk.getBrand());
			System.out.println("Warranty : " + hardDisk.getWarranty());
		} else {
			System.out.println("Sorry to say...");
			System.out.println("Your hard disk is rejected !!!");
		}
	}
}
