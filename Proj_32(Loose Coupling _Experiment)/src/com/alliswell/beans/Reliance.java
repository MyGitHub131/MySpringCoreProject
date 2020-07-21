package com.alliswell.beans;

public class Reliance implements ISimCard {

	@Override
	public void simActivated() {
		System.out.println("RelianceSim Details");
		System.out.println("-------------------");
		System.out.println("Calling started...");

	}

}
