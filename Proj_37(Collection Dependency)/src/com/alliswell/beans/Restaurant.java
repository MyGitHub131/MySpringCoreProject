package com.alliswell.beans;

import java.util.List;

public class Restaurant {
	private List<String> customers;

	public void greetCustomers() {
		System.out.println("List Of Customers work in restaurant : " + customers);
	}

	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}

}
