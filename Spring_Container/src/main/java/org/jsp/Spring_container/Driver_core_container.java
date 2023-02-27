package org.jsp.Spring_container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver_core_container {
	public static void main(String[] args) {
		
		//core container
		Resource resource=new ClassPathResource("pen.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
      	Pen pen=(Pen) beanFactory.getBean("pen");
      	Bike bike=(Bike) beanFactory.getBean("mybike");
      		
      	pen.buypen(35.0);	
      	bike.Start();
      		
      				
	}

}
