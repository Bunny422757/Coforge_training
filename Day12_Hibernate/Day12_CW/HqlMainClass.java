<<<<<<< HEAD
package com.coforge.main;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;

public class HqlMainClass {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*
		//HQL select
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		System.out.println(list);
		*/
		
//		//HQL Static Select
//		Query query = session.createQuery("from Employee where eid=105");
//		List<Employee> list = query.list();
//		System.out.println(list);
//		transaction.commit();
//		session.close();
//		factory.close();
		
//		//HQL Dynamic Select
//		Query query = session.createQuery("from Employee where eid=:idno");
//		query.setParameter("idno", 109);
//		List<Employee> list = query.list();
//		System.out.println(list);
		
//		//HQL Specific Column Select
//		Query query = session.createQuery("select ename from Employee");
//		List<Employee> list = query.list();
//		System.out.println(list);
		
		//HQL UPDATE
		Query query = session.createQuery("update Employee set ename=:empname where eid=:empid");
		query.setParameter("empname","Tagore");
		query.setParameter("empid",105);
		int n = query.executeUpdate();
		
		if(n == 1) {
			System.out.println("Object Updated");
		}else {
			System.out.println("Not Updated");
		}
//		List<Employee> list = query.list();
//		System.out.println(list);
		
		
		//System.out.println("Employees Generated");
		
	}

}
=======
package com.coforge.main;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.coforge.model.Employee;

public class HqlMainClass {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		/*
		//HQL select
		Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		System.out.println(list);
		*/
		
//		//HQL Static Select
//		Query query = session.createQuery("from Employee where eid=105");
//		List<Employee> list = query.list();
//		System.out.println(list);
//		transaction.commit();
//		session.close();
//		factory.close();
		
//		//HQL Dynamic Select
//		Query query = session.createQuery("from Employee where eid=:idno");
//		query.setParameter("idno", 109);
//		List<Employee> list = query.list();
//		System.out.println(list);
		
//		//HQL Specific Column Select
//		Query query = session.createQuery("select ename from Employee");
//		List<Employee> list = query.list();
//		System.out.println(list);
		
		//HQL UPDATE
		Query query = session.createQuery("update Employee set ename=:empname where eid=:empid");
		query.setParameter("empname","Tagore");
		query.setParameter("empid",105);
		int n = query.executeUpdate();
		
		if(n == 1) {
			System.out.println("Object Updated");
		}else {
			System.out.println("Not Updated");
		}
//		List<Employee> list = query.list();
//		System.out.println(list);
		
		
		//System.out.println("Employees Generated");
		
	}

}
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
