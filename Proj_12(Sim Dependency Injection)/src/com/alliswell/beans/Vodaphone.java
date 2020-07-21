package com.alliswell.beans;

public class Vodaphone implements ISim {

	@Override
	public void calling() {
		
		System.out.println("Calling Vodaphone Sim");
		
	}

	@Override
	public void data() {
		
		System.out.println("Browsing Data through Vodaphone Sim");
		
	}
	
}
