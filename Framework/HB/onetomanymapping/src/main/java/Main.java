import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.onetomany.AuthorBook.Unidirectional.Author1;
import com.onetomany.AuthorBook.Unidirectional.Book1;

public class Main {
	public static void main(String args[]) {
		Configuration conf=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Author1 a1=new Author1();
		a1.setName("kalu");
		Book1 b1=new Book1();
		Book1 b2=new Book1();
		Book1 b3=new Book1();
		b1.setName("java");
		b2.setName("js");
		b3.setName("php");
		List<Book1>ls=new ArrayList<Book1>();
		ls.add(b1);
		ls.add(b2);
		ls.add(b3);
		a1.setBook(ls);
		session.save(a1);
		session.beginTransaction().commit();
		
		
		
	}

}
