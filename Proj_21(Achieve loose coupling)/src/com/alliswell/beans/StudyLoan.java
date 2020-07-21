package com.alliswell.beans;

public class StudyLoan implements ILoanApproved {

	@Override
	public void loanApproved() {
		System.out.println("StudyLoan has been approved...");
	}

}
