package com.NativeQuery.Crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Service {
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);
	UpdateQuery uq=new UpdateQuery();
	DeleteQuery dq=new DeleteQuery();
	SelectQuery sq=new SelectQuery();
	public void insert() {
		session.beginTransaction();
		String sql="insert into customer(name,city,email,contact)values(?,?,?,?)";
		NativeQuery query=session.createNativeQuery(sql);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter contact");
		String contact=sc.next();
		query.setParameter(1,name);
		query.setParameter(2, city);
		query.setParameter(3, email);
		query.setParameter(4, contact);
		query.executeUpdate();
		session.getTransaction().commit();
	}
	public void update() {
		System.out.println("Press 1. for update name");
		System.out.println("Press 2. for update city");
		System.out.println("Press 3. for update email");
		System.out.println("Press 4. for update contact");
		System.out.println("Press 5. for update All details");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: uq.updateName();
			break;
		case 2:	uq.updateCity();
			break;
		case 3:	uq.updateEmail();
			break;
		case 4:	uq.updateContact();
			break;
		case 5:	uq.updateAll();
			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}
	public void delete() {
		System.out.println("Press 1. Delete by id");
		System.out.println("Press 2. Delete All");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:	dq.deleteById();
			break;
		case 2:
				dq.deleteAll();
			break;
		default:
			break;
		}
		
	}
	public void select() {
	System.out.println("Press 1. for select all");
	System.out.println("Press 2. for select by Id");
	System.out.println("Press 3. for select by name");
	System.out.println("Press 4. for select by city");
	System.out.println("Enter your choice");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:	sq.selectAll();
		break;
	case 2:	sq.selectById();
		break;
	case 3:	sq.selectByName();
		break;
	case 4:
			sq.selectByCity();
		break;
	default:
		System.out.println("Invalid choice");
	}
		
	}
	

}
