//
package com.vti.FinalExamJava.backend.businesslayer;

import com.vti.FinalExamJava.backend.datalayer.EmployeeDAO;
import com.vti.FinalExamJava.backend.datalayer.IEmployeeDAO;
import com.vti.FinalExamJava.entity.Employee;

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
public class EmployeeService implements IEmployeeService {
	
	private IEmployeeDAO dao;

	public EmployeeService() {
		
		dao=new EmployeeDAO();
	}

	public boolean insertEmployee(Employee empl) {
		// TODO Auto-generated method stub
		return dao.insertEmployee(empl);
	}

}
