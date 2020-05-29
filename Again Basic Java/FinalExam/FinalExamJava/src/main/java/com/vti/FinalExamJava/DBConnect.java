//
package com.vti.FinalExamJava;

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
 * This class is .
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 29-05-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 29-05-2020
 */
public class DBConnect {

	public static Connection openConnection() {
		Connection con = null;
		Properties propertiesFile = new Properties();
		try {
			propertiesFile.load(new FileInputStream("src/main/resource/jdbc.properties"));
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		String url = propertiesFile.getProperty("connectionString");
		String user = propertiesFile.getProperty("username");
		String password = propertiesFile.getProperty("password");
		String driver = propertiesFile.getProperty("driverSQLName");
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return con;
	}

	public static void closeAll(Connection con, PreparedStatement pstmt, ResultSet rs) {
		if (con != null)
			try {
				con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		if (pstmt != null)
			try {
				pstmt.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
	}
}
