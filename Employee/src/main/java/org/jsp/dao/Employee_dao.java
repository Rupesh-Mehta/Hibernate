package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Employee;

public class Employee_dao {
	//save or insert
	public void saveEmployee(Employee employee) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("leela");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	//Update
	public void update(Employee employee) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("leela");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		
	}
	//find
	public Employee findmyid(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("leela");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
//		Employee employee=entityManager.find(Employee.class, id);
//		if (employee!=null) {
//			System.out.println(employee);
//			
//		} else {
//			System.out.println("ID not found");
//
//		}
		//return employee;
		return entityManager.find(Employee.class, id);
		
	}
	public void deleteEmployee(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("leela");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Employee employee=entityManager.find(Employee.class, id);
		if (employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		} else {
			System.out.println("data not found");

		}
	}
		public void findAll()
		{
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("leela");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("select e from Employee e");
			List<Employee> employees=query.getResultList();
			System.out.println(employees);
			//return employees;
		}
}
		
		
		
		
		
		
		
		
		
	
		
	
	


