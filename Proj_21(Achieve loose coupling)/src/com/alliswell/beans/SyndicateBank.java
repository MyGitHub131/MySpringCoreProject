package com.alliswell.beans;

public class SyndicateBank {
	private ILoanApproved loanApproved2;

	public void activateLoanApproved2() {
		loanApproved2.loanApproved();
		System.out.println("Syndicate Bank Provided This Loan !!!");
		System.out.println("-------------------------------------");
	}

	public SyndicateBank(ILoanApproved loanApproved2) {
		this.loanApproved2 = loanApproved2;
	}

}
