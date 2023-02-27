package org.jsp.Animal;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoundDriver {
	public static void main(String[] args)  {
	
		//While using ApplicationContext we cann't use destroy method or close method
//	ApplicationContext context = new ClassPathXmlApplicationContext("project.xml");
//	AnimalSound animalSound=context.getBean(AnimalSound.class,"animalSound");
//	animalSound.sound();
	
	//while using CPXAC we can we destroy method or close method easily
	ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("project.xml");
	AnimalSound animalSound=applicationContext.getBean(AnimalSound.class,"animalSound");
	animalSound.sound();
	applicationContext.close();;
	
	}
	
}
