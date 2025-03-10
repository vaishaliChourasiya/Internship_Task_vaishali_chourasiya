package CrudHql;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import HB.HBHQLCRUD.Student;

public class SelectQuery {
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);

	public void selectAll() {
		session.beginTransaction();
		String query="from User";
		Query q=session.createQuery(query);
		List<User> ob=q.list();
		for(User s:ob) {
			System.out.println(s);
		}
	}

	public void selectById() {
		session.beginTransaction();
		String query="from User where id=:id";
		System.out.println("enter id");
		int id=sc.nextInt();
		
		Query q=session.createQuery(query);
		q.setParameter("id", id);
		List<User>ls=q.list();
		for(User u:ls) {
			System.out.println(u);
		}
		
	}

	public void selectByName() {
		session.beginTransaction();
		String query="from User where name=:name";
		System.out.println("Enter name");
		String name=sc.next();
		Query q=session.createQuery(query);
		q.setParameter("name", name);
		List<User>ls=q.list();
		for(User u:ls) {
			System.out.println(u);
		}
		
	}

	public void selectByCity() {
		
		session.beginTransaction();
		String query="from User where city=:city";
		System.out.println("Enter city");
		String city=sc.next();
		Query q=session.createQuery(query);
		q.setParameter("city", city);
		List<User>ls=q.list();
		for(User u:ls) {
			System.out.println(u);
		}
	}

//	public void selectByLikePattern() {
//		session.beginTransaction();
//		String query="from User where name=:name Like =:pattern";
//		System.out.println("enter pattern");
//		String pattern=sc.next();
//		Query q=session.createQuery(query);
//		q.setParameter("pattern", "pattern%");
//		List<User>ls=q.list();
//		for(User u:ls) {
//			System.out.println(u);
//		}
//		
//	}

}
