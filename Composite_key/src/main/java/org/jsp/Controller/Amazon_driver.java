package org.jsp.Controller;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Amazon;
import org.jsp.dto.Amazon_id;
import org.jsp.dto.Books;

public class Amazon_driver {
	
	public static void main(String[] args) {
		Amazon_id id=new Amazon_id();
		id.setEmail("rupesh@gmail.com");
		id.setMobno(9852485422l);
		
		Amazon amazon=new Amazon();
		amazon.setId(101);
		amazon.setAddress("Dombivli");
		amazon.setId2(id);
		
		
		Books books=new Books();
		books.setName("java");
		books.setAname("jdshdjh");
		books.setPublication(2002);
	
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("mehta");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(amazon);
		transaction.commit();
		
		
		
	}

}
