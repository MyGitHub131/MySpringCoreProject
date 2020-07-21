package com.cdi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;

import com.cdi.beans.Course;

public class CDITest {

	public static void main(String[] args) {
		BeanFactory facotry = new XmlBeanFactory(new ClassPathResource("com/cdi/common/application-context.xml"));
		Course course = facotry.getBean("btech1styrcse", Course.class);
		course.displayCourse();

	}
}
