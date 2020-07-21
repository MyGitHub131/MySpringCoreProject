package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Human {
	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;
	
	/*public Human() {
	}
	public Human(Heart heart) {
		this.heart = heart;
		System.out.println("Constructor getting called...");
	}*/

	/*@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called...");
	}
*/
	public void startPump() {
		if (heart != null) {
			heart.pump();
			System.out.println("Name of animal is : " + heart.getNameOfAnimal());
			System.out.println("No of hearts present in : " + heart.getNoOfHeart());
		} else {
			System.out.println("You are dead !!");
		}
	}
}
