package com.alliswell.beans;

public class ShineJobPortal {
	private IJobApply jobApply1;

/*	public void setJobApply1(IJobApply jobApply1) {
		this.jobApply1 = jobApply1;
	}*/
	
	public void activatedShineJobPortal(){
		jobApply1.jobApplied();
		
		System.out.println("Please guys don't apply any job on shinejobportal profile !!");
		System.out.println("------------------------------------------------------------");
	}

	ShineJobPortal(IJobApply jobApply1) {
		this.jobApply1 = jobApply1;
	}
	
	
}
