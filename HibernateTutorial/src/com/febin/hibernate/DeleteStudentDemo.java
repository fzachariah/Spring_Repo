package com.febin.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteStudentDemo {
	
	public static void main(String args[])
	{
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		
		try{
			
			int studentId=1;
			session.beginTransaction();
			Student student=session.get(Student.class, studentId);
			session.delete(student);
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			/*session=factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("delete Student where id=2").executeUpdate();
			session.getTransaction().commit();*/
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			factory.close();
		}
	}

}
