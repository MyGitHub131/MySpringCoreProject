package com.alliswell.beans;

public class SBIBank {
	private ILoanApproved loanApproved;

	public void activateLoanApproved() {
		loanApproved.loanApproved();
		System.out.println("SBI Bank Provided This Loan !!!");
		System.out.println("-------------------------------");
	}

	public SBIBank(ILoanApproved loanApproved) {
		this.loanApproved = loanApproved;
	}

}
