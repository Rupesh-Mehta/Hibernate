package com.jp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import com.jp.dto.Company;
import com.jp.dto.Employee;

public class Company_Employee_dao {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mehta");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void savedetails(Company company) {
		entityTransaction.begin();
		List<Employee> employee=company.getEmployee();
		for (Employee employee2 : employee) {
			employee2.setCompany(company);
		}
		entityManager.persist(company);
		entityTransaction.commit();
	
}
	public void updateCompany(String name,List<Employee>employee1) {
		entityTransaction.begin();
		Company company2=entityManager.find(Company.class, name);
		List<Employee> employees=company2.getEmployee();
		company2.setEmployee(employees);
		employees.addAll(employees);
		entityManager.merge(company2);
		entityTransaction.commit();
		
		
	}
//	public void deleteid(int id) {
//		Company comp=entityManager.find(Company.class, id);
//		if (comp!=null) {
//		      entityTransaction.begin();
//		      entityManager.remove(comp);
//		      entityTransaction.commit();
//		} else {
//			System.out.println("Id not found");
//
//		}
//	}

	}

