//
package com.vti.template.entity;

/**
 * This class is User. 
 * 
 * @Description: 
 * @author: HVTien
 * @create_date: 25-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 25-03-2020
 */
public class User {	
	
	private String FirstName;
	private String LastName;
	private String Phone;
	private String Email; 
	
	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HVTien
	 * @create_date: 25-03-2020
	 * @version: 1.0
	 * @modifer: HVTien
	 * @modifer_date: 25-03-2020
	 */
	public User() {
		super();
	}
	
	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: HVTien
	 * @create_date: 25-03-2020
	 * @version: 1.0
	 * @modifer: HVTien
	 * @modifer_date: 25-03-2020
	 * @param FirstName
	 * @param LastName
	 * @param Phone
	 * @param Email
	 */
	public User(String FirstName, String LastName,String Phone ,String Email) {
		super();
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Phone = Phone;
		this.Email = Email;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return Phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;		
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		LastName = lastName;		
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		Phone = phone;		
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;		
	}
	

}

