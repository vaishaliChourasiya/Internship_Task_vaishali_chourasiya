package HqlCrudOperation.Interface;

import org.hibernate.Session;

public interface DeleteInf {
	void deleteById(Session s);
	void deleteAll(Session s);
	void deleteMultipleUserById(Session s);

}
