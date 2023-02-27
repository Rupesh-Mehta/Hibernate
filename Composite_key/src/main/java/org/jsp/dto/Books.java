package org.jsp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Books implements Serializable {
   private String name;
   private int publication;
   //private int price;
   private String Aname;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPublication() {
	return publication;
}
public void setPublication(int publication) {
	this.publication = publication;
}
//public int getPrice() {
//	return price;
//}
//public void setPrice(int price) {
//	this.price = price;
//}
public String getAname() {
	return Aname;
}
public void setAname(String aname) {
	Aname = aname;
}
   

}
