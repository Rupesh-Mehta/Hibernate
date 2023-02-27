package org.jsp.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Car;

public class Car_controller {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mehta");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Car car=new Car();
		car.setId(102);
		car.setName("Audi Q7");
		car.setColor("white& black");
		car.setPrice(500000);
		
		entityTransaction.begin();
		entityManager.persist(car);
		entityTransaction.commit();
		
		Car car2=entityManager.find(Car.class, 101);
		Car car3=entityManager.find(Car.class, 102);
		
		Car car4=entityManager.find(Car.class, 101);
		Car car5=entityManager.find(Car.class, 102);
		
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);
		
	}

}
