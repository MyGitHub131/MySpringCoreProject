package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class GirlsMakeup {
	
	@Value("${GirlsMakeup.makeup_id}")
	private int makeup_id;
	@Value("${GirlsMakeup.foundation}")
	private String foudation;
	@Value("${GirlsMakeup.liner}")
	private String liner;
	@Value("${GirlsMakeup.lipstics}")
	private String lipstics;
	@Value("${GirlsMakeup.eyebrows}")
	private String eyebrows;
	
	/*@Override
	public String toString() {
		return "GirlsMakeup [makeup_id=" + makeup_id + ", foudation="
				+ foudation + ", liner=" + liner + ", lipstics=" + lipstics
				+ ", eyebrows=" + eyebrows + "]";
	}*/
	
	public void displayGirlsMakeup()
	{
		System.out.println("@@***Girls Makeup Details***@@");
		System.out.println("------------------------------");
		System.out.println("Makeup_id : " + makeup_id);
		System.out.println("Foundation : " + foudation);
		System.out.println("Liner : " + liner);
		System.out.println("Lipstic : " + lipstics);
		System.out.println("Eyebrow : " + eyebrows);
	}
	
}
