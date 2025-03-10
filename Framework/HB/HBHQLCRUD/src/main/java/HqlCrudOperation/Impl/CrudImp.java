package HqlCrudOperation.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import HqlCrudOperation.Entity.User1;
import HqlCrudOperation.Interface.CrudInterface;

public class CrudImp implements CrudInterface {
	Scanner sc=new Scanner(System.in);
	updateImp u=new updateImp();
	DeleteImp d=new DeleteImp();
	@Override
	public void insert(Session s, Transaction tx) throws ParseException {
		
		System.out.println("enter name of user");
		String name=sc.next();
		System.out.println("enter email of user");
		String email=sc.next();
		System.out.println("enter city of user");
		String city=sc.next();
		System.out.println("enter contact of user");
		String contact=sc.next();
		System.out.println("enter dob of user");
		String dob=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date date=sdf.parse(dob);
		User1 u=new User1(name, email,city, date,contact);
		s.save(u);
		s.getTransaction().commit();
	}

	@Override
	public void update(Session s, Transaction tx) throws ParseException {
		System.out.println("Press 1. for update name by id ");
		System.out.println("Press 2. for update email by id");
		System.out.println("Press 3. for update city by id");
		System.out.println("Press 4. for update contact by id");
		System.out.println("Press 5. for update Date of birth by id");
		System.out.println("Press 6. for update all details of user by id");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:u.updateName(s, tx);
			break;
		case 2:u.updateEmail(s, tx);
			break;
		case 3:u.updateCity(s, tx);
			break;
		case 4:u.updateContact(s, tx);
			break;
		case 5:u.updateDob(s, tx);
			break;
		case 6:u.updateAll(s,tx);
			break;
		default:
			System.out.println(" Invaid");
		}
		
	}

	@Override
	public void delete(Session s, Transaction tx) {
		System.out.println("Press 1.for delete All User");
		System.out.println("Press 2. for delete by id");
		System.out.println("Press 3. for delete multiple user by id");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:	d.deleteAll(s);
			break;
		case 2:	d.deleteById(s);
			break;
		case 3:	d.deleteMultipleUserById(s);
			break;
		default:
			System.out.println("Invalid");
		}
		
	}

	@Override
	public void select(Session s, Transaction tx) {
		
		
	}

	
}
