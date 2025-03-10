package HB.HBHQLCRUD;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;

public class Service {
	
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Student s=new Student();
	Scanner sc=new Scanner(System.in);
	
	public void add() {
		System.out.println("Hql not support insert operation");
		
	}

	public void update() {
		session.beginTransaction();
		
		String query="update Student set marks=:x where id=:y";
		org.hibernate.query.Query q =session.createQuery(query);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter("x", marks);
		q.setParameter("y", id);
		q.executeUpdate();
		session.getTransaction().commit();
		
		
		
	}

	public void delete() {
		
		session.beginTransaction();
		String query="delete from Student where id=:x";
		org.hibernate.query.Query q=session.createQuery(query);
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter("x", id);
		q.executeUpdate();
		session.getTransaction().commit();
	}

	public void selectAll() {
		
		session.beginTransaction();
		String query="from Student";
		org.hibernate.query.Query q=session.createQuery(query);
		List<Student> ob=q.list();
		for(Student s:ob) {
			System.out.println(s);
		}
	}

	public void selectById() {
		session.beginTransaction();
		String query="from Student where id=:x";
		System.out.println("enter id");
		int id=sc.nextInt();
		
		org.hibernate.query.Query q=session.createQuery(query);
		q.setParameter("x", id);
		List<Student> ob=q.list();
		for(Student s:ob) {
			System.out.println(s);
		}
	}
	

}
