package HqlCrudOperation;

import java.text.ParseException;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import HqlCrudOperation.Impl.CrudImp;

public class Main {
	
	public static void main(String args[]) throws ParseException {
		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Scanner sc=new Scanner(System.in);
		CrudImp c=new CrudImp();
		System.out.println("Press 1. for insert");
		System.out.println("Press 2. for update");
		System.out.println("Press 3. for delete");
		System.out.println("Press 4. for select");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:	c.insert(session,tx);
			break;
		case 2:	c.update(session, tx);
			break;
		case 3:	c.delete(session, tx);
			break;
		case 4:	c.select(session, tx);
			break;
		case 5 :
				System.out.println("Exit");
		default:
			System.out.println("Invalid");
		}
	}

}
