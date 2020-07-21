package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class AtmMasterCard {

	@Value("${AtmMasterCard.card_no}")
	private String card_no;
	@Value("${AtmMasterCard.name}")
	private String name;
	@Value("${AtmMasterCard.type}")
	private String type;
	@Value("${AtmMasterCard.card_type}")
	private String card_type;

	public void displayCardInfo() {
		System.out.println("@@***Atm MasterCard Info Details***@@");
		System.out.println("-------------------------------------");
		System.out.println("AtmMasterCard card_no : " + card_no);
		System.out.println("AtmMasterCard name : " + name);
		System.out.println("AtmMasterCard type : " + type);
		System.out.println("AtmMasterCard card_type : " + card_type);
	}
}
