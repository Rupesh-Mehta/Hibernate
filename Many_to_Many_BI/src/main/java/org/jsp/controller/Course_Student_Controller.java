package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Course_Student_dao;
import org.jsp.dto.Course;
import org.jsp.dto.Student;

public class Course_Student_Controller {
	public static void main(String[] args) {
		
		Course course=new Course();
		course.setCname("hibernate");
		course.setCduration("80 hours");
		
		Course course1=new Course();
		course1.setCname("j2ee");
		course1.setCduration("50 hours");
		
		
	   Student student=new Student();
	   student.setSname("bhalu");
	   student.setSmobno(845297391);
	 
	   Student student1=new Student();
	   student1.setSname("galu");
	   student1.setSmobno(845897390);
		
	
	
	   List<Student> list=new ArrayList<Student>();
	   list.add(student);
	   list.add(student1);
	   
//	   course.setStudents(list);
//	   course1.setStudents(list);
	   
	   List<Course> courses=new ArrayList<Course>();
	   courses.add(course);
	   courses.add(course1);
	   
	   student.setCourses(courses);
	   student1.setCourses(courses);
	   
	   Course_Student_dao course_Student_dao=new Course_Student_dao();
	   
//	   course_Student_dao.saveCoures(course);
//	   course_Student_dao.saveCoures(course1);
//	   course_Student_dao.saveStudent(student);
//	   course_Student_dao.saveStudent(student1);
	   //course_Student_dao.findmyid(7);
	   //course_Student_dao.findmyid1(8);
	   
	   course_Student_dao.updateCourse(8, list);
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
