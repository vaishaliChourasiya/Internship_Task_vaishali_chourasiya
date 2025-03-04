package HqlCrudOperation.Interface;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public interface UpdateInf {
	void updateName(Session s,Transaction tx);
	void updateCity(Session s,Transaction tx);
	void updateEmail(Session s,Transaction tx);
	void updateContact(Session s,Transaction tx);
	void updateDob(Session s, Transaction tx) throws ParseException;
	void updateAll(Session s,Transaction tx) throws ParseException;
}
