package HqlCrudOperation.Impl;

import org.hibernate.Session;

import HqlCrudOperation.Interface.DeleteInf;

public class DeleteImp  implements DeleteInf{

	@Override
	public void deleteById(Session s) {
		String query="delete from User1";
		s.cre
		
	}

	@Override
	public void deleteAll(Session s) {
		
		
	}

	@Override
	public void deleteMultipleUserById(Session s) {
		
		
	}

}
