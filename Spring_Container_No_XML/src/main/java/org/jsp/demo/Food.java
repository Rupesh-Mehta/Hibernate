package org.jsp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Food {
	@Value(value = "samosa pav")
	 private String name;
	@Value(value = "20")
	private double price;
  
	public void details() {
		System.out.println(name);
		System.out.println(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
