package EmployeeAddress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[]) {
		
		Configuration conf=new Configuration().configure("EmployeeAddress/hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		
		Employee e1=new Employee();
		e1.setName("bugi");
		
		Address a1=new Address();
		a1.setCity("indore");
		
		e1.setAddress(a1);
		
		session.save(a1);
		session.save(e1);
		
		session.beginTransaction().commit();
		
}
}
