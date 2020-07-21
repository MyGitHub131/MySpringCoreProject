package com.alliswell.beans;

public class AmazanEcomercePortal {
	private ICourierService courierService1;

	public void setCourierService1(ICourierService courierService1) {
		this.courierService1 = courierService1;
	}
	
	public void activatedServiceAmazanPortal(){
		courierService1.orderTracking();
		courierService1.delivery();
		
		System.out.println("AmazanEcomercePortal providing this services !!");
		System.out.println("-----------------------------------------------");
	}
}
