package com.alliswell.beans;

public class BlurDartCourier implements ICourierService {

	@Override
	public void orderTracking() {
		System.out.println("orderTracking is activated...");

	}

	@Override
	public void delivery() {
		System.out.println("Your product has been delivery today...");

	}

}
