package QuestionAnswer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String args[]) {
		Configuration conf=new Configuration().configure("QuestionAnswer/hibernate.cfg.xml");
		SessionFactory sf=conf.buildSessionFactory();
		System.out.println();
		Session session=sf.openSession();
		
		Question q1=new Question();
		q1.setQuestionId(1);
		q1.setQuestion("what is your name");
		
		Answer a1=new Answer();
		a1.setAnswerId(101);
		a1.setAnswer("my name is one to one mapping");
		
		q1.setAnswer(a1);
		
		session.save(a1);
		session.save(q1);
		session.beginTransaction().commit();;
		
		
	}
}
