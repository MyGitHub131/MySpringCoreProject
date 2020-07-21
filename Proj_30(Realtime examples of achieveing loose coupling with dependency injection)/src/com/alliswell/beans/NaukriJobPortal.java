package com.alliswell.beans;

public class NaukriJobPortal {
	IJobPortal iJobPortal = null;

	NaukriJobPortal(IJobPortal iJobPortal) {
		this.iJobPortal = iJobPortal;
	}
	public void NaukriPortalActivate(){
		System.out.println("Naukri Job Portal Provided Services.......");
		System.out.println("------------------------------------------");
		iJobPortal.activatedJobPortal();
	}
	
}
