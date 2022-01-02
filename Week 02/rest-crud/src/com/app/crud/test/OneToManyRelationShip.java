package com.app.crud.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.crud.Courses;

public class OneToManyRelationShip {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		// Process to execute the Query
		Courses c1 = new Courses();
		c1.setCourseName("ECE");
		c1.setFees(80000);
		com.app.crud.Courses c2 = new com.app.crud.Courses();
		c2.setCourseName("CSE");
		c2.setFees(120000);
		List<com.app.crud.Courses> fees = new ArrayList<Courses>();
		fees.add(c2);
		fees.add(c1);
		com.app.crud.Student student = new com.app.crud.Student();
		student.setStudentName("Vinay reddy");
		student.setStudentContact(924127);
		student.setStudentAddress("Hyderabad");
		session.save(c1);
		session.save(c2);
		session.save(student);
		tx.commit(); // Saving Object Permanently ans closing session
		factory.close(); // closing very expensive connection
	}

}
