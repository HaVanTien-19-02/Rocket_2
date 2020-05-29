//
package com.vti.FinalExamJava.backend.businesslayer;

import com.vti.FinalExamJava.entity.User;

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
public interface IUserService {
	boolean login(String userName, String password);
	boolean insertUser(User user);
	boolean getUserById(int id);
	User getUserByEmail(String email);
}
