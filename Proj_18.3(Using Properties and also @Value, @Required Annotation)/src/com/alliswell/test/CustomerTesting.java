package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.AtmMasterCard;

public class CustomerTesting {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			AtmMasterCard atmMasterCard = context.getBean("amc", AtmMasterCard.class);
				atmMasterCard.displayCardInfo();
	}
}
