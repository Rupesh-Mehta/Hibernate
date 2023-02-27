package org.jsp.flipkart.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Items {
	@Id
	private int id;
	private String iname;
	private String brand;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", iname=" + iname + ", brand=" + brand + ", price=" + price + "]";
	}
	
	 

}
