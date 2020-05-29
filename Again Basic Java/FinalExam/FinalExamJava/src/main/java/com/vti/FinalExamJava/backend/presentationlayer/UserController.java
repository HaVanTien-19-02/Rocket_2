//
package com.vti.FinalExamJava.backend.presentationlayer;

import com.vti.FinalExamJava.backend.businesslayer.IUserService;
import com.vti.FinalExamJava.backend.businesslayer.UserService;
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
public class UserController {
	private IUserService service;

	public UserController() {
		service = new UserService();
	}

	public boolean login(String userName, String password) {
		return service.login(userName, password);
	}

	public boolean insertUser(User user) {
		User u = service.getUserByEmail(user.getEmail());
		if (u != null) {
			return false;
		} else {
			return service.insertUser(user);
		}
	}

	public User getUserByEmail(String email) {
		return service.getUserByEmail(email);
	}
}
