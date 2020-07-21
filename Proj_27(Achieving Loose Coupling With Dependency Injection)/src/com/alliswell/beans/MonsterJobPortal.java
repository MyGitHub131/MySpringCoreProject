package com.alliswell.beans;

public class MonsterJobPortal {
	private IJobApply jobApply2;

	/*public void setJobApply2(IJobApply jobApply2) {
		this.jobApply2 = jobApply2;
	}*/
	
	public void activatedMonsterJobPortal(){
		jobApply2.jobApplied();
		
		System.out.println("Please my humble request to every one apply your proficient job on monsterjobportal profile !!");
		System.out.println("----------------------------------------------------------------------------------------------");
	}

	MonsterJobPortal(IJobApply jobApply2) {
		this.jobApply2 = jobApply2;
	}
	
}
