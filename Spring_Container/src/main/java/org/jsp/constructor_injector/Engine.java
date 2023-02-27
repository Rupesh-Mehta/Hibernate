package org.jsp.constructor_injector;

public class Engine {
	private int eid;
	private String cc;
	public Engine(int eid, String cc) {
		
		this.eid = eid;
		this.cc = cc;
	}
	public void engineDetails() {
		System.out.println("==============================");
		System.out.println(eid);
		System.out.println(cc);
	}
	

}
