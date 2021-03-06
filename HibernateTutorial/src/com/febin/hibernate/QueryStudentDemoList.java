package com.febin.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;


public class QueryStudentDemoList {
	
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		
		try{
			
			session.beginTransaction();
			
			
			java.util.List<Student> list1=session.createQuery("from Student").getResultList();
			
			for(int i=0;i<list1.size();i++)
			{
				System.out.println(list1.get(i).toString());
			}
			
			
			java.util.List<Student> listLast=session.createQuery("from Student s where s.lastName='Tiwari'").getResultList();
			
			for(int i=0;i<listLast.size();i++)
			{
				System.out.println(listLast.get(i).toString());
			}
			
			
			
			
			java.util.List<Student> list=session.createQuery("from Student s where s.lastName='Zachariah' OR s.firstName='Febin'").getResultList();
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).toString());
			}
			

			 list=session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i).toString());
			}
			
			session.getTransaction().commit();
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			factory.close();
		}
	}

}
