package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("octopusHeart")
	private Heart heart;

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("NameOfAnimal : " + heart.getNameOfAnimal());
			System.out.println("NoOfHeart : " + heart.getNoOfHeart());
		} else {
			System.out.println("You are dead !!!");
			System.out.println("Your organs are not working right now !!!");
		}
	}

}
