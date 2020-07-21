package com.alliswell.beans;

public class AirtelSim {
	
	private IService service;
	
	/*public void setService(IService service) {
		this.service = service;
	}
	*/
	public void activateService(){
		service.service();
		
		System.out.println("AirtelSim provited this services");
		System.out.println("--------------------------------");
	}

	public AirtelSim(IService service) {
		this.service = service;
	}

}
