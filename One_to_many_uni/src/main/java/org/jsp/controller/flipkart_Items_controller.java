package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.jsp.dao.flipart_Items_dao;
import org.jsp.flipkart.dto.Flipkart;
import org.jsp.flipkart.dto.Items;

public class flipkart_Items_controller {
	public static void main(String[] args) {
		Flipkart flipkart=new Flipkart();
		flipkart.setId(11);
		flipkart.setCname("Rupesh");
		flipkart.setEmail("rupesh@gmail.com");
		flipkart.setPwd("123");
		
		
		Items items=new Items();
		items.setId(103);
		items.setIname("Laptop");
		items.setBrand("Asus");
		items.setPrice(60000);
		
		Items items1=new Items();
		 items1.setId(104);
		 items1.setIname("mouse");
		 items1.setBrand("RG");
		 items1.setPrice(600);
		 
		 List<Items>list=new ArrayList<Items>();
		 list.add(items);
		 list.add(items1);
		 
		 flipkart.setItems(list);
		 
		 flipart_Items_dao dao=new flipart_Items_dao();
		 //dao.saveFlipkart(flipkart);
//		 dao.findmyid(10);
//		 dao.findmyid1(101);
		//dao.update(10, list);
		 //dao.deleteid(11);
		dao.findall();
		dao.findall1();
	}
	
}
