package com.alliswell.beans;

public class ShineJobPortal {
	IJobPortal iJobPortal = null;

	ShineJobPortal(IJobPortal iJobPortal) {
		this.iJobPortal = iJobPortal;
	}

	public void shinePortalActivate() {
		System.out.println("Shine Job Portal Provided Services.......");
		System.out.println("-----------------------------------------");
		iJobPortal.activatedJobPortal();
	}

}
