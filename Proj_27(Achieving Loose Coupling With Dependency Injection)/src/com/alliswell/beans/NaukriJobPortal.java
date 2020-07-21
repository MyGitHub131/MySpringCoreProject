package com.alliswell.beans;

public class NaukriJobPortal {
	private IJobApply jobApply;

	/*public void setJobApply(IJobApply jobApply) {
		this.jobApply = jobApply;
	}*/
	
	
	
	public void activatedNaukriJobPortal(){
		jobApply.jobApplied();
		
		System.out.println("Please apply your dream job on naukrijobportal profile !!");
		System.out.println("---------------------------------------------------------");
	}

	NaukriJobPortal(IJobApply jobApply) {
		this.jobApply = jobApply;
	}
}
