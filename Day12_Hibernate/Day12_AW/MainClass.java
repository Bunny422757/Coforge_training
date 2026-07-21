package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Course;
import com.coforge.model.Student;

public class MainClass {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Student student1 = new Student(101,"Pranav");
//		Student student2 = new Student(102,"Abhideep");
//		
//		Course course1 = new Course(1,"Spring Boot");
//		Course course2 = new Course(2,"Hibernate");
		
		//creating relationships
		Student student1 = session.get(Student.class, 101);//no save is required for this
		Student student2 = session.get(Student.class, 102);

		Course course1 = session.get(Course.class, 1);
		Course course2 = session.get(Course.class, 2);
		
		student1.getCourses().add(course1);
		student1.getCourses().add(course2);

		student2.getCourses().add(course1);

		course1.getStudents().add(student1);
		course1.getStudents().add(student2);

		course2.getStudents().add(student1);
		
		//session.save(course2);
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Student and courses relation Created");
	}

}
