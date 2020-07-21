package com.alliswell.beans;

public class PersonalLoan implements ILoanApproved {

	@Override
	public void loanApproved() {
		System.out.println("PersonalLoan already applied...");
	}
	
}
