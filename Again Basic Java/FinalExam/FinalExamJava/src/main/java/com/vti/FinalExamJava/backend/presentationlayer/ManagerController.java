//
package com.vti.FinalExamJava.backend.presentationlayer;

import com.vti.FinalExamJava.backend.businesslayer.IManagerService;
import com.vti.FinalExamJava.backend.businesslayer.ManagerService;
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
public class ManagerController {
	private IManagerService service;

	public ManagerController() {
		service = new ManagerService();
	}

	public boolean insertManager(Manager mn) {
		// TODO Auto-generated method stub
		return service.insertManager(mn);
	}
}
