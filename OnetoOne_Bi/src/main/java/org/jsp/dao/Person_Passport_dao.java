package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Passport;
import org.jsp.dto.Person;

public class Person_Passport_dao {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveperson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public void savepassport(Passport passport) {
		entityTransaction.begin();
		entityManager.persist(passport);
		entityTransaction.commit();
	}
	public void findmynm(String name)
	{
		Person person=entityManager.find(Person.class, name);
		if (person!=null) {
			System.out.println(person);
		} else {
                System.out.println("Name not found");
		}
		
	}
	public void deletename(String name) {
		Person person=entityManager.find(Person.class, name);
		if (person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		} else {
           System.out.println("name not found");
		}
	}
	public void deleteid(int id) {
		Passport passport=entityManager.find(Passport.class, id);
		if (passport!=null) {
			entityTransaction.begin();
			entityManager.remove(passport);
			entityTransaction.commit();
		} else {
           System.out.println("id not found");
		}
	}
	
	public void findall() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select p from Person p");
		List<Person> list=query.getResultList();
		System.out.println(list);
		
	}
	public void findall1() {
		// TODO Auto-generated method stub
		Query query=entityManager.createQuery("select p from Passport p");
		List<Passport> list=query.getResultList();
		System.out.println(list);
		
	}

}
