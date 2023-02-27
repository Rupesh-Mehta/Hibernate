package org.jsp.dto;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Amazon {
      private int id;
      
      private String address;
      @EmbeddedId
      private Amazon_id id2;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Amazon_id getId2() {
		return id2;
	}
	public void setId2(Amazon_id id2) {
		this.id2 = id2;
	}
	
      
}
