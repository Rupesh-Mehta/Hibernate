package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.flipkart.dto.Flipkart;
import org.jsp.flipkart.dto.Items;


public class flipart_Items_dao {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mehta");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveFlipkart(Flipkart kart ) {
		entityTransaction.begin();
		entityManager.persist(kart);
		entityTransaction.commit();
	}
	public void findmyid(int id) {
		Flipkart flipkart=entityManager.find(Flipkart.class, id);
		System.out.println(flipkart);
		
	}
	public void findmyid1(int id) {
		Items items=entityManager.find(Items.class, id);
		System.out.println(items);
		
	}
	public void update(int id,List<Items>items) {
		entityTransaction.begin();
		Flipkart flipkart=entityManager.find(Flipkart.class, id);
		List<Items> items2=flipkart.getItems();
		flipkart.setItems(items);
		items.addAll(items2);
		
		entityManager.merge(flipkart);
		entityTransaction.commit();
	
	}
	public void deleteid(int id) {
		Flipkart flipkart=entityManager.find(Flipkart.class, id);
		if (flipkart!=null) {
		      entityTransaction.begin();
		      entityManager.remove(flipkart);
		      entityTransaction.commit();
		} else {
			System.out.println("Id not found");

		}
	}
	public void findall() {
		 Query query=entityManager.createQuery("select f from Flipkart f");
		 List<Flipkart> flipkarts=query.getResultList();
		 System.out.println(flipkarts);
	}
	public void findall1() {
		 Query query=entityManager.createQuery("select i from Items i");
		 List<Items> items=query.getResultList();
		 System.out.println(items);
	}


}
