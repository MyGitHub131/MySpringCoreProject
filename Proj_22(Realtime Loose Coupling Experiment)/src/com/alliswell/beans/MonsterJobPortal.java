package com.alliswell.beans;

public class MonsterJobPortal {
	private IJobApplied jobApplied2 = null;
	
	public void activatedMonsterJobPortal()
	{
		jobApplied2.jobApplied();
		System.out.println("MonsterJobPortal is not a good please don't applied any job on this side !!!");
		System.out.println("----------------------------------------------------------------------------");
	}

	public MonsterJobPortal(IJobApplied jobApplied2) {
		this.jobApplied2 = jobApplied2;
	}
	
}
