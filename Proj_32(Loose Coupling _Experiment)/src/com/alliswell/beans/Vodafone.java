package com.alliswell.beans;

public class Vodafone implements ISimCard {

	@Override
	public void simActivated() {
		
		System.out.println("VodafoneSim Details");
		System.out.println("-------------------");
		System.out.println("Calling started...");

	}

}
