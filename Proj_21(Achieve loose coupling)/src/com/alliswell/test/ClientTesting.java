package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.HDFCBank;
import com.alliswell.beans.SBIBank;
import com.alliswell.beans.SyndicateBank;

public class ClientTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		
			SBIBank sbiBank = context.getBean("sbi", SBIBank.class);
				sbiBank.activateLoanApproved();
				
			HDFCBank hdfcBank = context.getBean("hdfc", HDFCBank.class);
				hdfcBank.activateLoanApproved1();
				
			SyndicateBank syndicateBank = context.getBean("sys", SyndicateBank.class);
				syndicateBank.activateLoanApproved2();
	}
}
