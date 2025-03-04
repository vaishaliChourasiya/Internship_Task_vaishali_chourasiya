package HB.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration conf=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf=conf.buildSessionFactory();
        Session session=sf.openSession();
        session.beginTransaction();
        System.out.println("session");
        Criteria c=session.createCriteria(UserDetail.class);
        System.out.println(c);
       c.add(Restrictions.eq("status","active"));
      List<UserDetail>ls=c.list();
      for(UserDetail ud:ls ) {
    	  System.out.println(ud);
      }
        
        
       
    }
}
