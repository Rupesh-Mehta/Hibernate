package org.jsp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	private int id;
	private String nationality;
	@OneToOne(mappedBy = "passport",cascade = CascadeType.ALL)
	private Person person;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
//	@Override
//	public String toString() {
//		return "Passport [id=" + id + ", nationality=" + nationality + "]";
//	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", nationality=" + nationality +  "]";
	}
	
	
	

}
