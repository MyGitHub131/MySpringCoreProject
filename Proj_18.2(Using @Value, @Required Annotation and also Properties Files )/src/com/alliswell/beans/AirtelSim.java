package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Value;

public class AirtelSim {
	@Value("${AirtelSim.sim_no}")
	private String sim_no;
	@Value("${AirtelSim.name}")
	private String name;
	@Value("${AirtelSim.generation}")
	private String generation;
	@Value("${AirtelSim.service}")
	private String service;
	@Value("${AirtelSim.size}")
	private String size;
	
	/*@Required
	@Value("${AirtelSim.sim_no}")
	public void setSim_no(String sim_no) {
		this.sim_no = sim_no;
	}
	@Value("${AirtelSim.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Value("${AirtelSim.generation}")
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	@Value("${AirtelSim.service}")
	public void setService(String service) {
		this.service = service;
	}
	@Value("${AirtelSim.size}")
	public void setSize(String size) {
		this.size = size;
	}*/

	public void displayAirtelSimInfo() {
		System.out.println("@@***Airtel Sim Information Details***@@");
		System.out.println("----------------------------------------");
		System.out.println("AirtelSim sim_no : " + sim_no);
		System.out.println("AirtelSim name : " + name);
		System.out.println("AirtelSim generation : " + generation);
		System.out.println("AirtelSim service : " + service);
		System.out.println("AirtelSim size : " + size);
	}
}
