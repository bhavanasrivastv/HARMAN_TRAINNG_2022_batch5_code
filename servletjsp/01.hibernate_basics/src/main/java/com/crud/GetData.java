package com.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.factory.HibernateSessionFactory;

public class GetData {
	
	public static void main(String[] args) {
		
		SessionFactory factory=HibernateSessionFactory.getSessionFactory();
		
		Session session=factory.openSession();
		
		session.getTransaction().begin();
		
		Employee employee=new Employee("amit", "banglore", "mgr", 46566, "amit@gmail.com");
		session.save(employee);
		
		session.getTransaction().commit();
		
	
		//Employee employee=session.get(Employee.class, 1);//proxy object
		
		factory.close();
//		
//		System.out.println("1.--------------------");
//		System.out.println(employee);
//		System.out.println("2.--------------------");
		session.close();
	
		
	
		
	}

}
