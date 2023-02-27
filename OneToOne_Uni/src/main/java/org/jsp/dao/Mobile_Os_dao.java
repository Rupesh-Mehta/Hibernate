package org.jsp.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;
import org.jsp.dto.Mobile;
import org.jsp.dto.Os;

public class Mobile_Os_dao {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveMobile(Mobile mobile) {
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityTransaction.commit();
	}
	public void saveOs(Os os) {
		entityTransaction.begin();
		entityManager.persist(os);
		entityTransaction.commit();
		
	}
	public void updateMobile(Mobile mobile) {
		entityTransaction.begin();
		entityManager.merge(mobile);
		entityTransaction.commit();
	}
	public void updateOs(Os os) {
		entityTransaction.begin();
		entityManager.merge(os);
		entityTransaction.commit();
	}
	public void Findidmobile(int id) {
		Mobile mobile=entityManager.find(Mobile.class, id);
		if (mobile!=null) {
			System.out.println(mobile);
			
		}else {
			System.out.println(id+"id not found");
		}
	}
		public void delete(int id) {
			Mobile mobile2=entityManager.find(Mobile.class, id);
			if (mobile2!=null) {
				entityTransaction.begin();
				entityManager.remove(mobile2);
				entityTransaction.commit();
			} else {
				System.out.println("Id not found");

			}
		}
		//findall
		public void findall() {
			Query query=entityManager.createQuery("select a from Mobile a");
			List<Mobile> m=query.getResultList();
			System.out.println(m);
		}
		
		
	
	
}




