package com.NativeQuery.Crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteQuery {
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);
	public void deleteById() {
		session.beginTransaction();
		String sql="delete from customer where id=?";
		Query q=session.createNativeQuery(sql);
			System.out.println("enter id");
			int id=sc.nextInt();
			q.setParameter(1, id);
			q.executeUpdate();
			session.getTransaction().commit();
			
	}
	public void deleteAll() {
		
		session.beginTransaction();
		String sql="delete from customer ";
		Query q=session.createNativeQuery(sql);
			
			q.executeUpdate();
			session.getTransaction().commit();
	}
	
}
