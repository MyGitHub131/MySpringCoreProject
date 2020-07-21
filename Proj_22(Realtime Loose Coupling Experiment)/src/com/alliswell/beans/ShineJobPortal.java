package com.alliswell.beans;

public class ShineJobPortal {
	private IJobApplied jobApplied1 = null;
	
	public void activatedShineJobPortal()
	{
		jobApplied1.jobApplied();
		System.out.println("ShineJobPortal is a very good side you can applied the job !!!");
		System.out.println("--------------------------------------------------------------");
	}

	public ShineJobPortal(IJobApplied jobApplied1) {
		this.jobApplied1 = jobApplied1;
	}
	
}
