//

package com.vti.template.function;

import java.util.Scanner;
import com.vti.template.form.LoginInput;
import com.vti.template.utils.ScannerUtil;

	/**
	 * This method is function. 
	 * 
	 * @Description: .
	 * @author: HVTien
	 * @create_date: 25-03-2020
	 * @version: 1.0
	 * @modifer: HVTien
	 * @modifer_date: 25-03-2020
	 * @param controller
	 */
public class Function {
		public void Login() {
			Scanner scanner = new Scanner(System.in);
			LoginInput input = null;
			String account, password;
			System.out.println("Login Program");
			System.out.println();
			// nhập email
			account = ScannerUtil.readString(scanner, "Invalid value, Please input string: ");
			// nhập password 
			password = ScannerUtil.readString(scanner, "Invalid value, Please input string: ");
			input = new LoginInput().setPassword(password).setAccount(account);
		}
}

	
