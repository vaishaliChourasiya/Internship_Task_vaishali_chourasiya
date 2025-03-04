package com.manytomany.EmpDepartment;

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
			Emp e1=new Emp();
			Emp e2=new Emp();
			
			Department d1=new Department();
			Department d2=new Department();
			e1.setName("jayesh");
			e2.setName("ritik");
			
			d1.setD_name("cs");
			d2.setD_name("It");
			
			List<Emp> ls=new ArrayList<Emp>();
			List<Department>l=new ArrayList<Department>();
			ls.add(e2);
			ls.add(e1);
			
			l.add(d2);
			l.add(d1);
			
			e1.setDept(l);
			d1.setEmp(ls);
			
			session.save(e1);
			session.save(e2);
			session.save(d1);
			session.save(d2);
			session.beginTransaction().commit();
		}
}
