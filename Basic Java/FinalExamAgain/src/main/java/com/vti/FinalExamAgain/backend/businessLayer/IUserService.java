//
package com.vti.FinalExamAgain.backend.businessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
/**
 * This class is IUserService . 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 12-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 12-04-2020
 */
public interface IUserService {
	public void createUser(String Email, String Password, String FirstName, String LastName, String Phone )
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;

	/**
	 * This method is . 
	 * 
	 * @Description: .
	 * @author: HVTien
	 * @create_date: 12-04-2020
	 * @version: 1.0
	 * @modifer: HVTien
	 * @modifer_date: 12-04-2020
	 * @param email
	 * @param password
	 */
	public void Login(String email, String password)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException;;
}
