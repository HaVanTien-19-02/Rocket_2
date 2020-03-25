
package com.vti.template.form;


/**
 * This class is LoginInput. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 25-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 25-03-2020
 */
public class LoginInput {
	private String account, password;

	
	public String getAccount() {
		return account;
	}

	
	public String getPassword() {
		return password;
	}

	
	public LoginInput setAccount(String account) {
		this.account = account;
		return this;
		
	}

	
	public LoginInput setPassword(String password) {
		this.password = password;
		return this;
		
	}

}
