package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart = null;

	/*public void setHeart(Heart heart) {
		this.heart = heart;
	}
*/
	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("Name Of Animal : " + heart.getNameOfAnimal());
			System.out.println("No Of Hearts : " + heart.getNoOfHearts());
		} else {
			System.out.println("You are dead !!!");
			System.out.println("Your organs are not functioning !!!");
		}
	}
}
