package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	/*public Human() {

	}

	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Human Constructor is getting called...");
	}

	@Autowired
	@Qualifier("octpousHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter Method is getting called...");
	}*/

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal is : "
					+ heart.getnameOfAnimal() + " no of heart present in : "
					+ heart.getNoOfHeart());
		} else {
			System.out.println("You are dead !!");
		}
		
	}
}
