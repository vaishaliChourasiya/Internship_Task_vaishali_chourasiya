package HB.HBMapping.EmbeddingObject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[]) {
		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		System.out.println("perfect");
		Scanner sc=new Scanner(System.in);
		Certificate c1=new Certificate(20,"java ");
		Student s=new Student("vaishali",c1);
		session.save(s);
		session.beginTransaction().commit();
		
		
	}

}
