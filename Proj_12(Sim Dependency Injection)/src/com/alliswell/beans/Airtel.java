package com.alliswell.beans;

public class Airtel implements ISim {

	@Override
	public void calling() {
		
		System.out.println("Calling Airtel Mobile");
	}

	@Override
	public void data() {
		
		System.out.println("Browsing Data through Airtel Mobile");
		
	}
	
}
