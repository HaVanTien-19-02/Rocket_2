//
package com.vti.FinalExamJava.backend.businesslayer;

import com.vti.FinalExamJava.backend.datalayer.IManagerDAO;
import com.vti.FinalExamJava.backend.datalayer.ManagerDAO;
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
public class ManagerService implements IManagerService {
private IManagerDAO dao;

	public ManagerService() {	
		dao=new ManagerDAO();
	}

	public boolean insertManager(Manager mn) {
		// TODO Auto-generated method stub
		return dao.insertManager(mn);
	}

}
