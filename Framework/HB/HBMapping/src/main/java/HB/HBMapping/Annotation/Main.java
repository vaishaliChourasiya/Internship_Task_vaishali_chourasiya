package HB.HBMapping.Annotation;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter contact");
		String contact=sc.next();
		
		UserAnnotation u=new UserAnnotation(name,city,contact);
		session.save(u);
		session.beginTransaction().commit();

	}

}
