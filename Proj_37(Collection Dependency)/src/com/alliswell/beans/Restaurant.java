package com.alliswell.beans;

import java.util.List;

public class Restaurant {
	private List<String> workers;

	public void displayWorkers() {
		System.out.println("List Of Restaurant Workers : " + workers);
	}

	public void setWorkers(List<String> workers) {
		this.workers = workers;
	}

}
