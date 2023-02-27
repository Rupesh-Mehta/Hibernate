package org.jsp.Spring_container;

import org.jsp.constructor_injector.Mouse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mouse_Driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("mouse.xml");
		Mouse mouse=(Mouse)context.getBean("mymouse");
		mouse.details();
	}

}
