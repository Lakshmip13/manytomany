package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStudent {
public static void main(String[] args) {
	EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=emfEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student student=new Student();
	student.setName("pooja");
	student.setAge(23);
	student.setGender("female");
	student.setMarks(88);
	
	Student student1=new Student();
	student1.setName("lakshmi");
	student1.setAge(24);
	student1.setGender("female");
	student1.setMarks(85);

	Student student2=new Student();
	student2.setName("spoorthi");
	student2.setAge(26);
	student2.setGender("female");
	student2.setMarks(98);

	 Course course=new Course();
	 course.setName("Java");
	 course.setTariner("Venky");
	 course.setCost(45000.0);
	 
	 Course course1=new Course();
	 course1.setName("Mern");
	 course1.setTariner("");
	 course1.setCost(45000.0);
	 
	 Course course2=new Course();
	 course2.setName("Java");
	 course2.setTariner("Venky");
	 course2.setCost(45000.0);
	 
	 Course course3=new Course();
	 course3.setName("Java");
	 course3.setTariner("Venky");
	 course3.setCost(45000.0);



	 
	 
}
}
