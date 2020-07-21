package com.alliswell.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alliswell.beans.MonsterJobPortal;
import com.alliswell.beans.NaukriJobPortal;
import com.alliswell.beans.ShineJobPortal;

public class ResourseTesting {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		
			NaukriJobPortal naukriJobPortal = context.getBean("naukriJobPortal", NaukriJobPortal.class);
			naukriJobPortal.activatedNaukriJobPortal();
			
			ShineJobPortal shineJobPortal = context.getBean("shineJobPortal", ShineJobPortal.class);
			shineJobPortal.activatedShineJobPortal();
			
			MonsterJobPortal monsterJobPortal = context.getBean("monsterJobPortal", MonsterJobPortal.class);
			monsterJobPortal.activatedMonsterJobPortal();
	}
}
