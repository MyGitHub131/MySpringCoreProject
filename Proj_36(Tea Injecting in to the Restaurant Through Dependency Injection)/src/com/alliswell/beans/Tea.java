package com.alliswell.beans;

public class Tea implements IHotDrink {

	@Override
	public void preparedHotDrink() {
		System.out.println("Dear Customer, We are preparing tea for you !");
	}

}
