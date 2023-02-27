package org.jsp.Animal;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

	public void doSound() {
		System.out.println("Bawoo...Bawoo.");
		
	}

}
