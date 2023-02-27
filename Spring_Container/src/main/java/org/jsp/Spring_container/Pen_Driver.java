package org.jsp.Spring_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pen_Driver {
	public static void main(String[] args) {
		
		//JEE Container
		ApplicationContext context=new ClassPathXmlApplicationContext("pen.xml");
		Pen pen=(Pen) context.getBean("pen");
		pen.buypen(20.0);
	}

}
