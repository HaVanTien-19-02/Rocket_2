//
package com.vti.FinalExamAgain.backend.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.FinalExamAgain.backend.dataLayer.UserRespository;


/**
 * This class is UserServiceImpl. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 12-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 12-04-2020
 */
public class UserServiceImpl implements IUserService{	
	
	private UserRespository respository;
	
	
	public UserServiceImpl() {
		respository = new UserRespository();
	}
	
	public void createUser(String Email, String Password, String FirstName, String LastName, String Phone ) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		respository.createUser(Email, Password, FirstName, LastName, Phone);
	}
	
	public void Login(String Email, String Password ) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		respository.Login(Email, Password);
	}
	

}
