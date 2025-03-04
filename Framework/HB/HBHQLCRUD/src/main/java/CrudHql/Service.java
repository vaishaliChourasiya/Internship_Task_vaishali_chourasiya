package CrudHql;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Service {
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);
	UpdateQuery uq=new UpdateQuery();
	SelectQuery sq=new SelectQuery();
	public void insert() throws ParseException {
		System.out.println("Enter id,name,city,contact and dob");
		int id=sc.nextInt();
		String name=sc.next();
		String city=sc.next();
		String contact=sc.next();
		String dob=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date=sdf.parse(dob);
		
		User u=new User();
		u.setId(id);
		u.setName(name);
		u.setCity(city);
		u.setContact(contact);
		u.setDob(date);
		session.save(u);
		session.beginTransaction().commit();
		System.out.println("hql doesnt have any query");
	}
	public void update() throws ParseException {
		System.out.println("Press 1: for update name");
		System.out.println("Press 2: for update city");
		System.out.println("Press 3: for update contact");
		System.out.println("Press 4: for update dob");
		System.out.println("Press 5: for update All");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			uq.updateName();
			break;
		case 2: uq.updateCity();
			break;
		case 3:
				uq.updateContact();
			break;
		case 4:
			uq.updateDob();
			break;
		case 5:
			uq.updateAll();
		default:
			System.out.println("Invalid choice");
		}
		
	}
	public void delete() {
		session.beginTransaction();
		String query="delete from User where id=:x";
		System.out.println("enter id");
		int id=sc.nextInt();
		
		Query q=session.createQuery(query);
		q.setParameter("x", id);
		q.executeUpdate();
		session.getTransaction().commit();
		
	}
	public void select() {
		System.out.println("Press 1. for select All");
		System.out.println("Press 2. for select By Id");
		System.out.println("Press 3. for select By Name");
		System.out.println("Press 4. for select by city");
	//	System.out.println("Press 5. for select by Like pattern");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			sq.selectAll();
			break;
		case 2:	sq.selectById();
			break;
		case 3:	sq.selectByName();
			break;
		case 4:
				sq.selectByCity();
			break;
		case 5:
				//sq.selectByLikePattern();
			break;
		default:
			break;
			
		}
		
	}

}
