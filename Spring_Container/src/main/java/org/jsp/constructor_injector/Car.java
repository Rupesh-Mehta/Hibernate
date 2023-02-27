package org.jsp.constructor_injector;

public class Car {
	private int cid;
	private String cname;
	private String color;
	private double price;
	
	private Engine engine;

	public Car(int cid, String cname, String color, double price, Engine engine) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.color = color;
		this.price = price;
		this.engine = engine;
	}
	
	public void carDetails() {
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(color);
		System.out.println(price);
		System.out.println(engine);
	}

	public Engine getEngine() {
		return engine;
	}
	

}
