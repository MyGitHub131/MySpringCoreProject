package com.alliswell.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.alliswell.beans.GurgaonPizzaBakery;
import com.alliswell.beans.PunePizzaBakery;

public class PizzaTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alliswell/common/application-context.xml");
		
			GurgaonPizzaBakery gurgaonPizzaBakery = context.getBean("gurgaonPizzaBakery", GurgaonPizzaBakery.class);
			gurgaonPizzaBakery.orderPizza();
			
			PunePizzaBakery pizzaBakery = context.getBean("punePizzaBakery", PunePizzaBakery.class);
			pizzaBakery.orderPizza();
			
		/*XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/alliswell/common/application-context.xml"));
		
			GurgaonPizzaBakery gurgaonPizzaBakery = factory.getBean("gurgaonPizzaBakery",GurgaonPizzaBakery.class);
			gurgaonPizzaBakery.orderPizza();
			
			PunePizzaBakery pizzaBakery = factory.getBean("punePizzaBakery",PunePizzaBakery.class);
			pizzaBakery.orderPizza();*/
	}
}
