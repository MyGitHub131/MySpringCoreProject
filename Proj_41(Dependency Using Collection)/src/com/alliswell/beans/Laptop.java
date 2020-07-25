package com.alliswell.beans;

import java.util.Map;
import java.util.Properties;

public class Laptop {
	private Map<String, HardDisk> highestRatingHardDiskChips;
	private Properties mostPopulerHardDisk;

	public void setHighestRatingHardDiskChips(Map<String, HardDisk> highestRatingHardDiskChips) {
		this.highestRatingHardDiskChips = highestRatingHardDiskChips;
	}

	public void setMostPopulerHardDisk(Properties mostPopulerHardDisk) {
		this.mostPopulerHardDisk = mostPopulerHardDisk;
	}

	@Override
	public String toString() {
		return "Laptop [highestRatingHardDiskChips=" + highestRatingHardDiskChips + ", mostPopulerHardDisk="
				+ mostPopulerHardDisk + "]";
	}

}
