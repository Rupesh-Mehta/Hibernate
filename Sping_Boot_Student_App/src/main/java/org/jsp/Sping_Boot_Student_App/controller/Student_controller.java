package org.jsp.Sping_Boot_Student_App.controller;

import org.jsp.Sping_Boot_Student_App.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_controller {
	@GetMapping("/get")
	public String getStudent() {
		return "i am get student msg";
	}
	@PostMapping("/ravi")
	public void postStudent(){
		System.out.println("i am posting msg");
	}
	@GetMapping("/getStudent") //
	public Student student() {
		Student student=new Student();
		student.setId(101);
		student.setName("Rupesh");
		student.setPercentage(78.6);
		return student;
	}
	@PostMapping("/saveStudentData")
	public void saveStudent(@RequestBody Student student) {
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getPercentage());
	}
	

}
