package org.jsp.Animal;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalSound {
	
	private Animal animal;
//	@Autowired
//	public AnimalSound(@Qualifier(value = "lion") Animal animal) {
//		this.animal=animal;
//		
//	}
	
	
     
	public Animal getAnimal() {
		return animal;
	}
      @Autowired
      @Qualifier(value = "dog")
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
      @PostConstruct
      public void load() {
    	  System.out.println("hello");
      }
      @PreDestroy
      public void unload() {
    	  System.out.println("byee..");
      }
	public void sound() {
		animal.doSound();
	}
	
	
	
}
