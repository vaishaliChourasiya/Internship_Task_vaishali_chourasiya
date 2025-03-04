package CustomerAddress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class main {
public static void main(String args[]) {
	
	Configuration conf=new Configuration().configure("CustomerAddress/hibernate.cfg.xml");
	SessionFactory sf=conf.buildSessionFactory();
	Session session =sf.openSession();
	
	Customer c1=new Customer();
	c1.setName("ruhi");
	
	Address a1=new Address();
	a1.setCity("bhopal");
	c1.setAddress(a1);
	session.save(c1);
	session.beginTransaction().commit();

}
}
