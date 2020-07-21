package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.FMMirchhi104;
import com.alliswell.beans.IReceiver;
import com.alliswell.beans.RadioMirchhi97;

public class RadioTesting {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
			IReceiver iReceiver = ctx.getBean("all1", FMMirchhi104.class);
				iReceiver.frequency();
				iReceiver.infrared();
	}
}
