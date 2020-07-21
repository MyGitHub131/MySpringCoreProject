package com.alliswell.beans;

public class HouseLoan implements ILoanApproved {

	@Override
	public void loanApproved() {
		System.out.println("HouseLoan is approval stage...");
	}

}
