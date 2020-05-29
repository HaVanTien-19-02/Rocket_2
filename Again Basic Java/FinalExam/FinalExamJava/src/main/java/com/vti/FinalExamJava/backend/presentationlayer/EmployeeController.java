//
package com.vti.FinalExamJava.backend.presentationlayer;

import com.vti.FinalExamJava.backend.businesslayer.EmployeeService;
import com.vti.FinalExamJava.backend.businesslayer.IEmployeeService;
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
public class EmployeeController {
	private IEmployeeService service;

	public EmployeeController() {
		service = new EmployeeService();
	}

	public boolean insertEmployee(Employee empl) {
		// TODO Auto-generated method stub
		return service.insertEmployee(empl);
	}

}
