package com.NativeQuery.Crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateQuery {
	
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);
	public void updateName() {
		session.beginTransaction();
		String sql="update customer set name=? where id=?";
		Query q=session.createNativeQuery(sql);
		System.out.println("enter name to update");
		String name=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter(1, name);
		q.setParameter(2,id);
		q.executeUpdate();
		session.getTransaction().commit();
	}
	public void updateCity() {
		session.beginTransaction();
		String sql="update customer set city=? where id=?";
		Query q=session.createNativeQuery(sql);
		System.out.println("enter city to update");
		String city=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter(1, city);
		q.setParameter(2,id);
		q.executeUpdate();
		session.getTransaction().commit();
	}
	public void updateContact() {
		session.beginTransaction();
		String sql="update customer set contact=? where id=?";
		Query q=session.createNativeQuery(sql);
		System.out.println("enter contact to update");
		String contact=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter(1, contact);
		q.setParameter(2,id);
		q.executeUpdate();
		session.getTransaction().commit();
	}
	public void updateEmail() {
		session.beginTransaction();
		String sql="update customer set email=? where id=?";
		Query q=session.createNativeQuery(sql);
		System.out.println("enter email to update");
		String email=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter(1, email);
		q.setParameter(2,id);
		q.executeUpdate();
		session.getTransaction().commit();
	}
	public void updateAll() {
		session.beginTransaction();
		String sql="update customer set name=? , city=? , email=? , contact=? where id=?";
		Query q=session.createNativeQuery(sql);
		System.out.println("enter name , city , email , contact to update and id" );
		String name=sc.next();
		String city=sc.next();
		String email=sc.next();
		String contact=sc.next();
		int id=sc.nextInt();
		q.setParameter(1, name);
		q.setParameter(2, city);
		q.setParameter(3, email);
		q.setParameter(4, contact);
		q.setParameter(5, id);
		q.executeUpdate();
		session.getTransaction().commit();
		
	}
}
