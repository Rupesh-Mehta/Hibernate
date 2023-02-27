package org.jsp.Spring_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Marker_driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("marker.xml");
		Marker marker=(Marker) context.getBean("mymarker");
		marker.use();
		marker.colour();
	}

}
