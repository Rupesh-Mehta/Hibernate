package org.jsp.Animal;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal {

	public void doSound() {
		System.out.println("Haaa....");
		
	}

}

