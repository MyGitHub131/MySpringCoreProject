package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.FlipKart;


public class LCTestApp {
	public static void main(String[] args){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/application-context.xml");
		FlipKart  bean=ctx.getBean("fpk",FlipKart.class);
		ctx.getBean("fpk");
		String billmsg=bean.purchase(new String[]{"shirt","mobile","books"});
		System.out.println(billmsg); 
	}
}