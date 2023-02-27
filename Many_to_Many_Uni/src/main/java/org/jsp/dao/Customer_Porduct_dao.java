package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Customer;
import org.jsp.dto.Product;



public class Customer_Porduct_dao {
	
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mehta");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void savecustomer(Customer customer) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		
	}
//	public void findmyid(int id) {
//		Customer customer=entityManager.find(Customer.class, id);
//		System.out.println(customer);
//	}
	public Customer findmyid(int id) {
		Customer customer=entityManager.find(Customer.class, id);
		if(customer!=null) {
		System.out.println(customer);
		}else {
			System.out.println("Id not found");
		}
		return customer;
	}
	
	public void update(int id,List<Product>product) {
		entityTransaction.begin();
		Customer customer=entityManager.find(Customer.class, id);
		if (customer!=null) {
		List<Product> product1=customer.getProduct();
		product1.addAll(product);
		customer.setProduct(product1);
		
		entityManager.merge(customer);
		entityTransaction.commit();
		
	}else {
		System.out.println("id not found");
	}
	}
	public void deleteid(int id) {
		
		Customer customer=entityManager.find(Customer.class, id);
		if (customer!=null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
		} else {
              System.out.println("id not found");
		}
	}
	public void findall() {
		 Query query=entityManager.createQuery("select c from Customer c");
		 List<Customer> customers=query.getResultList();
		 System.out.println(customers);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
