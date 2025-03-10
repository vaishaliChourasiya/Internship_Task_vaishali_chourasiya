package HqlCrudOperation.Interface;

import java.text.ParseException;

import org.hibernate.Session;
import org.hibernate.Transaction;

public interface CrudInterface {
	void insert(Session s,Transaction tx) throws ParseException;
	void update(Session s,Transaction tx) throws ParseException;
	void delete(Session s,Transaction tx);
	void select(Session s,Transaction tx);

}
