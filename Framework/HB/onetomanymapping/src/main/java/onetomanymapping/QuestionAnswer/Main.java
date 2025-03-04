package onetomanymapping.QuestionAnswer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	e1.setName("vaishu");
	e2.setName("rupali");
	
	List<Employee>ls=new ArrayList<Employee>();
	ls.add(e1);
	ls.add(e2);
	Department d1=new Department();
	d1.setName("cs");
	d1.setEmp(ls);
	e1.setDept(d1);
	e2.setDept(d1);
	session.save(d1);
	session.beginTransaction().commit();
	
	
	}
}
