package com.alliswell.beans;

public class NaukriJobPortal {
	private IJobApplied jobApplied = null;

	public void activatedNaukriJobPortal() {
		jobApplied.jobApplied();
		System.out.println("NaukriJobPortal Is a Suitable For Your Job You Can applied !!!");
		System.out.println("--------------------------------------------------------------");
	}

	public NaukriJobPortal(IJobApplied jobApplied) {
		this.jobApplied = jobApplied;
	}

}
