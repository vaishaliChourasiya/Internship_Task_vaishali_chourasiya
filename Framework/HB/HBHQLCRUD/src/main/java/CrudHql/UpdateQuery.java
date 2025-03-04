package CrudHql;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateQuery {

	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);
	public void updateName() {
		session.beginTransaction();
		String query="update User set name=:x where id=:id";
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		Query q=session.createQuery(query);
		q.setParameter("x", name);
		q.setParameter("id", id);
		q.executeUpdate();
		session.getTransaction().commit();
		
	}

	public void updateCity() {
		session.beginTransaction();
		String query="update User set city=:city where id=:id";
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		Query q=session.createQuery(query);
		q.setParameter("city", city);
		q.setParameter("id", id);
		q.executeUpdate();
		session.getTransaction().commit();
		
		
	}

	public void updateDob() throws ParseException {
		session.beginTransaction();
		String query="update User set dob=:dob where id=:id";
		System.out.println("enter dob");
		String dob=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date=sdf.parse(dob);
		System.out.println("enter id");
		int id=sc.nextInt();
		Query q=session.createQuery(query);
		q.setParameter("dob", date);
		q.setParameter("id", id);
		q.executeUpdate();
		session.getTransaction().commit();
		
	}

	public void updateContact() {
		session.beginTransaction();
		String query="update User set contact=:contact where id=:id";
		System.out.println("enter contact");
		String contact=sc.next();
		System.out.println("enter id");
		int id=sc.nextInt();
		Query q=session.createQuery(query);
		q.setParameter("contact", contact);
		q.setParameter("id", id);
		q.executeUpdate();
		session.getTransaction().commit();
		
	}

	public void updateAll() {
		session.beginTransaction();
		String query="update User set name=:name and city=:city and contact=:contact and dob=:dob where id=:id";
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter city");
		String city=sc.next();
		System.out.println("enter contact ");
		String contact=sc.next();
		System.out.println(" enter dob");
		String dob=sc.next();
		Query q=session.createQuery(query);
		q.setParameter("name", name);
		q.setParameter("city", city);
		q.setParameter("contact", contact);
		q.setParameter("dob", dob);
		q.executeUpdate();
		session.getTransaction().commit();
	}
	

}
