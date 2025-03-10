package StudentAddress;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration conf=new Configuration().configure("StudentAddress/hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Student s1=new Student();
		s1.setId(78);
		s1.setName("bugi");
		
		Address a1=new Address();
		a1.setAddressId(23);
		a1.setCity("indore");
		a1.setState("MP");
		
		s1.setAddress(a1);
		session.save(a1);
		session.save(s1);
		session.beginTransaction().commit();
	}

}
