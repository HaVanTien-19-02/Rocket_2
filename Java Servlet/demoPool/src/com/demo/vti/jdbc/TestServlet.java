package com.demo.vti.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.demo.vti.jdbc.Students;;


/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/student_demo_database")
	private DataSource dataSource;
	   
	Connection myConn = null;
	Statement myStatement = null;
	PreparedStatement myPrepra  = null;
	ResultSet resultSet = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Step 1: Set up PrintWriter
		response.setContentType("text/html");
		//step 2: Get connection to the database
		try {
			myConn =  dataSource.getConnection();
			//step 3: Create a Sql statements
			
			
			//step 4: execute sql querry
			
			
			//step 5: Process the resultSet
			
			
			String action = request.getServletPath();
			
			try {
				switch (action) {
				case "/delete":
					deleteStudent(request, response);
					break;
				case "/add":
					addStudent(request, response);
					break;
				case "/new":
					newAdd(request, response);
					break;
				case "/edit":
					editForm(request, response);
					break;
				case "/update":
					updateStudent(request, response);
					break;
				default:
					listSt(request, response);
					break;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
					

		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				myConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private void listSt (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Students> listStudent = new ArrayList<Students>();
		String sql = " SELECT * FROM student";
		myStatement = myConn.createStatement();
		resultSet = myStatement.executeQuery(sql);
		while(resultSet.next()) {
			int id = resultSet.getInt("id");
			String firstName = resultSet.getString("first_name");
			String lastName = resultSet.getString("last_name");
			String email = resultSet.getString("email");
			listStudent.add(new Students(id, firstName, lastName, email));
		}
		request.setAttribute("list", listStudent);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Tables.jsp");
		dispatcher.forward(request, response);
		
	}
	
	private void deleteStudent (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		int id = Integer.parseInt(request.getParameter("id"));		
		String deleteSt = "DELETE FROM student WHERE id = ?;";		
		myPrepra = myConn.prepareStatement(deleteSt);		
		myPrepra.setInt(1, id);		
		myPrepra.executeUpdate();
		response.sendRedirect("list");
	}
	
	private void newAdd (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/AddStudent.jsp");
		dispatcher.forward(request, response);
	}
	
	private void addStudent (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
	
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		String addSt = "INSERT INTO student" + "(first_name, last_name, email) VALUES " + " (?, ?, ?);";		
		myPrepra = myConn.prepareStatement(addSt);
		myPrepra.setString(1, firstName);
		myPrepra.setString(2, lastName);
		myPrepra.setString(3, email);
		myPrepra.executeUpdate();
		response.sendRedirect("list");
	}
	
	private void editForm (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		Students st = null;
		int id = Integer.parseInt(request.getParameter("id"));		
		String selectStudent = "SELECT * FROM student WHERE id = ?;";		
		myPrepra = myConn.prepareStatement(selectStudent);		
		myPrepra.setInt(1, id);		
		resultSet = myPrepra.executeQuery();
		
		while (resultSet.next()) {
			String firstName = resultSet.getString("first_name");
			String lastName = resultSet.getString("last_name");
			String email = resultSet.getString("email");
			st = new Students(id, firstName, lastName, email);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/EditForm.jsp");
		request.setAttribute("student", st);
		dispatcher.forward(request, response);
		
	}
	
	private void updateStudent (HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email =request.getParameter("email");
		int id = Integer.parseInt(request.getParameter("id"));
		
		String update = "UPDATE student SET first_name = ?,last_name = ?, email= ? WHERE id = ?;";
		myPrepra = myConn.prepareStatement(update);
		myPrepra.setString(1, firstName);
		myPrepra.setString(2, lastName);
		myPrepra.setString(3, email);
		myPrepra.setInt(4, id);
		myPrepra.executeUpdate();
		response.sendRedirect("list");				
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
