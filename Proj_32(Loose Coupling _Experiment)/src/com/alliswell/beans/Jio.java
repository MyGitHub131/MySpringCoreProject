package com.alliswell.beans;

public class Jio implements ISimCard {

	@Override
	public void simActivated() {
		
		System.out.println("JIO Sim Details");
		System.out.println("--------------");
		System.out.println("Calling started...");
	}

}
