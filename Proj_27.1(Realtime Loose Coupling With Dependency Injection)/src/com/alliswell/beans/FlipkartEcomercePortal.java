package com.alliswell.beans;

public class FlipkartEcomercePortal {
	private ICourierService courierService;

	public void setCourierService(ICourierService courierService) {
		this.courierService = courierService;
	}
	
	public void activatedServiceFlipkartPortal(){
		courierService.orderTracking();
		courierService.delivery();
		
		System.out.println("FlipkartEcomercePortal providing this sevices !!");
		System.out.println("------------------------------------------------");
	}
}
