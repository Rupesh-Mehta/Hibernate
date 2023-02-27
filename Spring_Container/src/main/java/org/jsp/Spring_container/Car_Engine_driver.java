package org.jsp.Spring_container;

import org.jsp.constructor_injector.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_Engine_driver {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("car_engine.xml");
		Car car=(Car) context.getBean("car");
		car.carDetails();
		car.getEngine().engineDetails();//to call engineDetails
	}

}
