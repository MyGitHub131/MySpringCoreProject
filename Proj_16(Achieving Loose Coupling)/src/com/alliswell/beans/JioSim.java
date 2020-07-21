package com.alliswell.beans;

public class JioSim {
	
	private IService service1;

	/*public void setService1(IService service1) {
		this.service1 = service1;
	}*/
	public void activateService1(){
		service1.service();
		
		System.out.println("JioSim provited this services");
		System.out.println("-----------------------------");
	}

	public JioSim(IService service1) {
		this.service1 = service1;
	}

}
