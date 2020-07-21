package com.alliswell.beans;

public class Airtel implements ISimCard {

	@Override
	public void simActivated() {

		System.out.println("AirtelSim Details");
		System.out.println("-----------------");
		System.out.println("Calling started...");
	}

}
