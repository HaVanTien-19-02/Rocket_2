//
package com.vti.FinalExamJava.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.FinalExamJava.DBConnect;
import com.vti.FinalExamJava.entity.Manager;

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
public class ManagerDAO implements IManagerDAO {

	public boolean insertManager(Manager mn) {
		Connection con;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DBConnect.openConnection();
		try {
			pstmt = con.prepareStatement(
					"insert into Manager (uid,expInYear) values (?,?)");
			pstmt.setInt(1, mn.getUser().getUId());
			pstmt.setInt(2, mn.getExpInYear());
			
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnect.closeAll(con, pstmt, rs);
		}
		return false;
	}

}
