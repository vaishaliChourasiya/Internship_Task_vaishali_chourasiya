package com.onetoone.AuthorBook;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[]) {
		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter author_name");
		String aname=sc.next();
		System.out.println("enter book_name");
		String bname=sc.next();
		Author a1=new Author();
		a1.setA_name(aname);
		Book b1=new Book();
		b1.setB_name(bname);
		a1.setBook(b1);
		b1.setAuthor(a1);
		session.save(a1);
		session.beginTransaction().commit();
	}

}
