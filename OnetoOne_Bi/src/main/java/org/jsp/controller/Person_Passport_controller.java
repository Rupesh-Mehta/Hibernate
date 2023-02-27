package org.jsp.controller;

import org.jsp.dao.Person_Passport_dao;
import org.jsp.dto.Passport;
import org.jsp.dto.Person;

public class Person_Passport_controller {
	public static void main(String[] args) {
		Person person=new Person();
		person.setId(203);
		person.setName("Ramu");
		person.setAddress("Dombivli");
		person.setAge(25);
		
		
		Passport passport=new Passport();
		passport.setId(2);
		passport.setNationality("Indian");
		passport.setPerson(person);
		
		person.setPassport(passport);
		
		Person_Passport_dao dao=new Person_Passport_dao();
//		dao.saveperson(person);
//		dao.savepassport(passport);
		//dao.findmynm("Ram");
		//dao.deletename("Ramu");
		//dao.deleteid(2);
		dao.findall();
		dao.findall1();
		
		
		
	}

}
