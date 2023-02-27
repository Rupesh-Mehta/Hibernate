package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.dto.Course;
import org.jsp.dto.Student;

public class Course_Student_dao {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mehta");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveCoures(Course course) {
		entityTransaction.begin();
		entityManager.persist(course);
		entityTransaction.commit();
	}
	public void saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
	}
	public void findmyid(int id) {
		Course course=entityManager.find(Course.class, id);
		if (course!=null) {
			System.out.println(course);
		} else {
           System.out.println("Id not found");
		}
	}
	public void findmyid1(int id) {
		Student student=entityManager.find(Student.class, id);
		if (student!=null) {
			System.out.println(student);
		} else {
           System.out.println("Id not found");
		}
	}
	public void updateCourse(int id,List<Student>students) {
		entityTransaction.begin();
		Course course=entityManager.find(Course.class, id);
		if (course!=null) {
			List<Student> students1=course.getStudents();
			students1.addAll(students);
			course.setStudents(students1);
			
			
			entityManager.merge(course);
			entityTransaction.commit();
		} else {

		}
	}

}
