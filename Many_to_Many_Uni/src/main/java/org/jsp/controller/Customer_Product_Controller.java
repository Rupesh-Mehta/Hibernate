package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Customer_Porduct_dao;
import org.jsp.dto.Customer;
import org.jsp.dto.Product;

public class Customer_Product_Controller {
	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
		//customer.setCid(101);
		customer.setCname("Shyam");
		customer.setAddress("Dombivli");
		customer.setEmail("rupesh@gmail.com");
		
        Customer customer1=new Customer();
		
		//customer.setCid(101);
		customer1.setCname("Ram");
		customer1.setAddress("Dombivli");
		customer1.setEmail("ram@gmail.com");
		
		
		Product product=new Product();
		//product.setPid(1);
		product.setPname("Watch");
		product.setBrand("Quartz");
		product.setPrice(1199);
		
		Product product1=new Product();
		//product.setPid(1);
		product1.setPname("Mobile");
		product1.setBrand("samsung");
		product1.setPrice(20000);
		
	   List<Product> list=new ArrayList<Product>();
	   list.add(product);
	   list.add(product1);
	   
	   customer.setProduct(list);
	   customer1.setProduct(list);
	   
	   Customer_Porduct_dao customer_Porduct_dao=new Customer_Porduct_dao();
       //customer_Porduct_dao.savecustomer(customer);
//	   customer_Porduct_dao.savecustomer(customer1);
	   //customer_Porduct_dao.findmyid(4);
	   customer_Porduct_dao.update(4, list);
	   //customer_Porduct_dao.deleteid(7);
	   //customer_Porduct_dao.findall();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
