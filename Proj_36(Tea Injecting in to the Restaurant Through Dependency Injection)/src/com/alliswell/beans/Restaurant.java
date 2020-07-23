package com.alliswell.beans;

public class Restaurant {
	Tea tea = null;

	public Restaurant(Tea tea) {
		this.tea = tea;
	}
	public void displayRestaurant(){
		tea.preparedHotDrink();
	}
}
