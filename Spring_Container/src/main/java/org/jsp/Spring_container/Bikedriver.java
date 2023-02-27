package org.jsp.Spring_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bikedriver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bike.xml");
		Bike bike=(Bike) context.getBean("mybike");
		bike.Start();
		bike.off();
	}

}
