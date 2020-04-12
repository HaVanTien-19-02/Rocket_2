//
package com.vti.FinalExamAgain.backend.dataLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
/**
 * This class is UserRespository. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 12-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 12-04-2020
 */
public class UserRespository {
	private Connection getDatabaseConnection()
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// get property
		Properties propertiesFile = new Properties();
		propertiesFile.load(new FileInputStream("src/main/resource/database.properties"));

		String url = propertiesFile.getProperty("connectionString");
		String user = propertiesFile.getProperty("username");
		String password = propertiesFile.getProperty("password");
		String driver = propertiesFile.getProperty("driverSQLName");

		Class.forName(driver);

		return DriverManager.getConnection(url, user, password);
	}
	
	public void createUser(String Email, String Password, String FirstName, String LastName, String Phone )
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {

		// B1: get a Database Connection
		Connection connection = getDatabaseConnection();

		// B2: write statement
		String sqlStatement = "INSERT INTO User (Email, `Password`, FirstName, LastName, Phone) "
							+ "VALUES			(	?,		?,		 ?,			?,       ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);

		// set parameter
		preparedStatement.setString(1, Email);
		preparedStatement.setString(2, Password);
		preparedStatement.setString(3, FirstName);
		preparedStatement.setString(4, LastName);
		preparedStatement.setString(5, Phone);

		// execute Query Update
		preparedStatement.executeUpdate();

		// close connection
		connection.close();
	}
	
	public void Login(String Email,String Password) 
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
	
		Connection connection = getDatabaseConnection();

		String sql1 = " SELECT Email, `Password`"
					+ " FROM User"
					+ " WHERE Email=? AND `Password`=?";

		PreparedStatement ps = connection.prepareStatement(sql1);

		ps.setString(1, Email);
		ps.setString(2, Password);
		
		ResultSet table = ps.executeQuery();
		while(table.next()) {
			System.out.println("login success");
		}
		
		connection.close();
	}

	

}
