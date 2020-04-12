//
package com.vti.FinalExamAgain.backend.presentationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.FinalExamAgain.backend.businessLayer.UserServiceImpl;
import com.vti.FinalExamAgain.backend.businessLayer.IUserService;
/**
 * This class is UserController. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 12-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 12-04-2020
 */
public class UserController {
	private IUserService service;
	
	public UserController() {
		service = new UserServiceImpl();
	}
	
	public void createUser(String Email, String Password, String FirstName, String LastName, String Phone ) 
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		service.createUser(Email, Password, FirstName, LastName, Phone);
	}
	
	public void Login(String Email, String Password) 
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		service.Login(Email, Password);
	}
}
