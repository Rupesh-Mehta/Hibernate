package com.jp.Controller;

import java.util.ArrayList;
import java.util.List;

import com.jp.dao.Company_Employee_dao;
import com.jp.dto.Company;
import com.jp.dto.Employee;

public class Company_Employee_Controller {
	public static void main(String[] args) {
	
	Company company=new Company();
	company.setId(105);
	company.setCname("JPM");
	company.setAddress("Mumbai");
	company.setEmail("JPM@gmail.com");
	
	Employee employee=new Employee();
	employee.setEid(1012);
	employee.setEname("Rupesh");
	employee.setAddress("Dombivli");
	employee.setSalary(50000);
	//employee.setCompany(company);
	
	Employee employee1=new Employee();
	employee1.setEid(1010);
	employee1.setEname("Ram");
	employee1.setAddress("Thane");
	employee1.setSalary(40000);
	//employee1.setCompany(company);
	
	List<Employee> employees=new ArrayList<Employee>();
	//employees.add(employee1);
	employees.add(employee);
	
	company.setEmployee(employees);
	//employee.setCompany(company);
	
	Company_Employee_dao dao=new Company_Employee_dao();
	//dao.savedetails(company);
	//dao.updateCompany("Rupesh", employees);
	//dao.deleteid(102);
	

}
}
