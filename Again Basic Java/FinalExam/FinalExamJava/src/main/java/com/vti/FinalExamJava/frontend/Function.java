//
package com.vti.FinalExamJava.frontend;

import java.util.Scanner;

import com.vti.FinalExamJava.backend.presentationlayer.EmployeeController;
import com.vti.FinalExamJava.backend.presentationlayer.ManagerController;
import com.vti.FinalExamJava.backend.presentationlayer.UserController;
import com.vti.FinalExamJava.entity.Employee;
import com.vti.FinalExamJava.entity.Manager;
import com.vti.FinalExamJava.entity.User;
import com.vti.FinalExamJava.utils.ScannerUtil;

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
public class Function {
	public void Login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Username:");
		String username = ScannerUtil.readEmail(sc, "error");
		System.out.println("Password:");
		String password = ScannerUtil.readPassword(sc, "error");
		boolean bl = new UserController().login(username, password);
		if (bl) {
			System.out.println("Đăng nhập thành công!");
		}else {
			System.out.println("Đăng nhập thất bại!");
		}
	}

	public void createManager() {
		User u = new User();
		Manager mn = new Manager();
		u.input();
		mn.input(u);
		boolean bl = new UserController().insertUser(u);
		if (bl) {
			mn.setUser(new UserController().getUserByEmail(u.getEmail()));
			boolean bl1 = new ManagerController().insertManager(mn);
			if (bl1) {
				System.out.println("Tạo Manager thành công!");
			} else {
				System.out.println("Tạo Manager thất bại!");
			}
		} else {
			System.out.println("Tạo User thất bại! Email đã tồn tại");
		}
	}

	public void createEmployee() {
		User u = new User();
		Employee empl = new Employee();
		u.input();
		empl.input(u);
		boolean bl = new UserController().insertUser(u);
		if (bl) {
			empl.setUser(new UserController().getUserByEmail(u.getEmail()));
			boolean bl1 = new EmployeeController().insertEmployee(empl);
			if (bl1) {
				System.out.println("Tạo Employee thành công!");
			} else {
				System.out.println("Tạo Employee thất bại!");
			}
		} else {
			System.out.println("Tạo User thất bại!");
		}
	}
}
