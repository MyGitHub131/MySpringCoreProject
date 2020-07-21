package com.alliswell.beans;

public class MonstarJobPortal {
	IJobPortal iJobPortal = null;

	MonstarJobPortal(IJobPortal iJobPortal) {
		this.iJobPortal = iJobPortal;
	}
	public void monstarPortalActivate(){
		System.out.println("Monstar Job Portal Provided all services.......");
		System.out.println("-----------------------------------------------");
		iJobPortal.activatedJobPortal();
	}
}
