package org.jsp.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
  public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	Food food=context.getBean("food",Food.class);
	food.details();
}
}
