package HB.Mapping;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
   public static void main(String args[]) {
	   
	   Configuration conf=new Configuration().configure();
	   SessionFactory sf=conf.buildSessionFactory();
	   Session session=sf.openSession();
	   
	   
	   Emp ob=new Emp();
	   Address ad=new Address();
	   ob.setId(101);
	   ob.setName("bugi");
	   
	   ad.setAid(222);
	   ad.setCity("indore");
	   ad.setState("MP");
	   ad.setCountry("india");
	   
	   ob.setAddress(ad);
	   session.save(ad);
	   session.save(ob);
	   
	   session.beginTransaction().commit();
	   
   }
        
    }

