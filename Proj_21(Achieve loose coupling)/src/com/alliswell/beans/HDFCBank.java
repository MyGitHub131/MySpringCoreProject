package com.alliswell.beans;

public class HDFCBank {
	private ILoanApproved loanApproved1;

	public void activateLoanApproved1() {
		loanApproved1.loanApproved();
		System.out.println("HDFC Bank Provided This Loan !!!");
		System.out.println("--------------------------------");
	}

	public HDFCBank(ILoanApproved loanApproved1) {
		this.loanApproved1 = loanApproved1;
	}

}
