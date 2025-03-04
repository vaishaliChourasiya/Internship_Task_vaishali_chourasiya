package com.onetomany.Bidirectional;

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
		Department d1=new Department();
		d1.setD_name("CS");
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		e1.setE_name("vikas");
		e2.setE_name("nihal");
		e3.setE_name("vishal");
		e1.setDept(d1);
		e2.setDept(d1);
		List<Employee> ls=new ArrayList<Employee>();
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		d1.setEmp(ls);
		session.save(d1);
		session.beginTransaction().commit();
		
	}

}
