package HB.NativeQuery;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Service {
	Configuration conf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session=sf.openSession();
	Scanner sc=new Scanner(System.in);
	Employee e=new Employee();
	public void add() {
		session.beginTransaction();
		String q="insert into employee_details(name,city,salary)values(?,?,?)";
	NativeQuery query=session.createNativeQuery(q);
	System.out.println("enter name");
	String name=sc.next();
	System.out.println("enter city");
	String city=sc.next();
	System.out.println("enter salary");
	int salary=sc.nextInt();
	query.setParameter(1, name);
	query.setParameter(2, city);
	query.setParameter(3, salary);
	query.executeUpdate();
	session.getTransaction().commit();
		
	}
	public void update() {
		
		session.beginTransaction();
		String sql="update  employee_details set salary=? where id=?";
		NativeQuery q=session.createNativeQuery(sql);
		System.out.println("enter salary");
		int salary=sc.nextInt();
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter(1, salary);
		q.setParameter(2, id);
		q.executeUpdate();
		session.getTransaction().commit();
	}
	public void delete() {
		session.beginTransaction();
		String sql="delete from employee_details where id=?";
		NativeQuery q=session.createNativeQuery(sql);
		System.out.println("enter id");
		int id=sc.nextInt();
		q.setParameter(1, id);
		q.executeUpdate();
		session.getTransaction().commit();
		
		
	}
	public void selectAll() {
		session.beginTransaction();
		String sql="select * from employee_details";
		NativeQuery q=session.createNativeQuery(sql);
		q.addEntity(Employee.class);
		List<Employee> ls=q.list();
		for(Employee e:ls) {
			System.out.println(e);
		}
		
	}
	public void selectById() {
		session.beginTransaction();
		String sql="select * from employee_details where id=?";
		NativeQuery q=session.createNativeQuery(sql);
		System.out.println( "enter id");
		int id=sc.nextInt();
		q.setParameter(1,id);
		q.addEntity(Employee.class);
		List<Employee> ls=q.list();
		for(Employee e:ls) {
			System.out.println(e);
		}
		
	}
	

}
