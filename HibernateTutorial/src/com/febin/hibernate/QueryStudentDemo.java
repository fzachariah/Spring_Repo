package com.febin.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class QueryStudentDemo {
	
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		
		try{
			System.out.println("Creating the object");	
			Student student=new Student("Febin", "Zachariah", "febinzachariah6@gmail.com");
			
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			factory.close();
		}
	}

}
