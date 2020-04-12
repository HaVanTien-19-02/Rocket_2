//
package com.vti.FinalExamAgain.frontend;

import java.util.Scanner;

import com.vti.FinalExamAgain.backend.presentationLayer.UserController;
import com.vti.FinalExamAgain.utils.ScannerUtil;


/**
 * This class is function. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 12-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 12-04-2020
 */
public class Function {
	
	private UserController controller;
	private Scanner scanner;
	
	public Function() {
		controller = new UserController();
		scanner = new Scanner(System.in);
	}
	
	public void createUser() {

		try {
			System.out.print("Please input email: ");
			String Email = ScannerUtil.readString(scanner, "");
			
			System.out.print("\nPlease input password: ");
			String Password = ScannerUtil.readString(scanner, "");

			System.out.print("\nPlease input first name: ");
			String FirstName = ScannerUtil.readString(scanner, "");

			System.out.print("\nPlease input last name: ");
			String LastName = ScannerUtil.readString(scanner, "");

			System.out.print("\nPlease input phone: ");
			String Phone = ScannerUtil.readString(scanner, "");

			controller.createUser(Email, Password, FirstName, LastName,Phone );

			System.out.println("\nRegister Success");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void Login() {

		try {
			System.out.print("Please input email: ");
			String Email = ScannerUtil.readString(scanner, "");
			
			System.out.print("\nPlease input password: ");
			String Password = ScannerUtil.readString(scanner, "");

			controller.Login(Email, Password );

			System.out.println("\nLogin Success");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}

