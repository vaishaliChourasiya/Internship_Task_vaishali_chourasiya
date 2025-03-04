package HB.HBMapping.GetLoad;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HB.HBMapping.Map.User;

public class Get {

	public static void main(String[] args) {
		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
		int id=sc.nextInt();
		
		User u=session.get(User.class, id);
		System.out.println(u);
		
		

	}

}
