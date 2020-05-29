//
package com.vti.FinalExamJava.backend.businesslayer;

import com.vti.FinalExamJava.backend.datalayer.IUserDAO;
import com.vti.FinalExamJava.backend.datalayer.UserDAO;
import com.vti.FinalExamJava.entity.User;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 29-05-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 29-05-2020
 */
public class UserService implements IUserService {
	private IUserDAO dao;

	public UserService() {	
		dao=new UserDAO();;
	}

	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return dao.login(userName, password);
	}

	public boolean insertUser(User user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

	
	public boolean getUserById(int id) {
		// TODO Auto-generated method stub
		return dao.getUserById(id);
	}

	
	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return dao.getUserByEmail(email);
	}

}
