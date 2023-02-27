package org.jsp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Amazon_id implements Serializable {
     private String email;
     private long mobno;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
     
     
     
}
