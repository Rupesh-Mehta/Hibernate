package org.jsp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int id;
     private String sname;
     private int smobno;
     
     @ManyToMany(cascade = CascadeType.ALL)
     @JoinTable(joinColumns = @JoinColumn(name = "sid"),inverseJoinColumns = @JoinColumn(name = "cid"))
     private List<Course> courses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSmobno() {
		return smobno;
	}

	public void setSmobno(int smobno) {
		this.smobno = smobno;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student id=" + id + ", sname=" + sname + ", smobno=" + smobno ;
	}
	
     
}
