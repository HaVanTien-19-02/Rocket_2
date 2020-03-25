//
package com.vti.template.backend.businesslayer;

import java.util.List;

import com.vti.template.entity.User;

/**
 * This class is . 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 25-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 25-03-2020
 */
public interface ILoginUser {
	boolean login(String userName, String passWord);

	List <User> getAllUser();

	boolean insertUser(User user);

}
