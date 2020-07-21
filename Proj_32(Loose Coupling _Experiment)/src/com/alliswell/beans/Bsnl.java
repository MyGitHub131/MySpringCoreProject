package com.alliswell.beans;

public class Bsnl implements ISimCard {

	@Override
	public void simActivated() {

		System.out.println("BsnlSim Details");
		System.out.println("---------------");
		System.out.println("Calling started...");
	}

}
