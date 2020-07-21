package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class JioSim {
	@Value("${JioSim.sim_no}")
	private String sim_no;
	@Value("${JioSim.name}")
	private String name;
	@Value("${JioSim.generation}")
	private String generation;
	@Value("${JioSim.services}")
	private String service;
	@Value("${JioSim.size}")
	private String size;
	
	
	/*//@Value("${JioSim.sim_no}")
	public void setSim_no(String sim_no) {
		this.sim_no = sim_no;
	}

	//@Value("${JioSim.name}")
	public void setName(String name) {
		this.name = name;
	}

	//@Value("${JioSim.generation}")
	public void setGeneration(String generation) {
		this.generation = generation;
	}

	//@Value("${JioSim.services}")
	public void setService(String service) {
		this.service = service;
	}

	//@Value("${JioSim.size}")
	public void setSize(String size) {
		this.size = size;
	}*/

	public void displayJioSimInfo() {
		System.out.println("@@***Jio Sim Information Details***@@");
		System.out.println("-------------------------------------");
		System.out.println("JioSim Sim_No : " + sim_no);
		System.out.println("JioSim Name : " + name);
		System.out.println("JioSim Generation : " + generation);
		System.out.println("JioSim Service : " + service);
		System.out.println("JioSim Size : " + size);
	}
}
