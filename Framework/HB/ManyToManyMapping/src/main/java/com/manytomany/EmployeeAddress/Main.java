package com.manytomany.EmployeeAddress;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String args[]) {
		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setName("nihal");
		e2.setName("jayesh");
		
		Address a1=new Address();
		Address a2=new Address();
		a1.setCity("Indore");
		a1.setState("MP");
		a2.setCity("bhopal");
		a2.setState("MP");
		
		List<Employee>ls=new ArrayList<Employee>();
		ls.add(e2);
		ls.add(e1);
		a1.setEmp(ls);
		
		List<Address>l=new ArrayList<Address>();
		l.add(a2);
		l.add(a1);
		e1.setAddress(l);
		session.save(e1);
		session.save(e2);
		session.save(a1);
		session.save(a2);
		session.beginTransaction().commit();
	}

}
