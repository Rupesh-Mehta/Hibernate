package org.jsp.controller;

import java.util.List;

import org.jsp.dao.Employee_dao;
import org.jsp.dto.Employee;

public class Employee_controller {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(102);
		employee.setName("Rupesh");
		employee.setAddress("Dombivli");
		employee.setSalary(50000);
		
		Employee_dao employee_dao=new Employee_dao();
		//employee_dao.saveEmployee(employee);
		//employee_dao.update(employee);
//		employee_dao.findmyid(101);
//		Employee employee2=employee_dao.findmyid(1010);
//		if(employee2!=null) {
//			System.out.println(employee2);
//		}else {
//			System.out.println("id not found");
//		}
		//employee_dao.deleteEmployee(102);
		employee_dao.findAll();
//		List<Employee> list=employee_dao.findAll();
//		System.out.println(list);
	}

}
