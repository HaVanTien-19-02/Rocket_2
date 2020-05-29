//
package com.vti.FinalExamJava.frontend;

import java.util.Scanner;
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
public class Program {

	public static void main(String[] args) {
		Function f = new Function();
		Scanner sc = new Scanner(System.in);
		int choose;
		int choose1;
		while (true) {
			System.out.println("----------Welcome---------");
			System.out.println("1.	Tạo User.");
			System.out.println("2.	Đăng nhập.");
			choose = ScannerUtil.readInt(sc, "Mời bạn nhập vào số nguyên! \nVui lòng nhập lại: ");
			switch (choose) {
			case 1:
				boolean bl = true;
				while (bl) {
					System.out.println("1.Manager");
					System.out.println("2.Employee");
					System.out.println("3.Back");
					choose1 = ScannerUtil.readInt(sc, "Mời bạn nhập vào số nguyên! \nVui lòng nhập lại: ");
					if (choose1 == 1) {
						f.createManager();

					} else if (choose1 == 2) {
						f.createEmployee();

					} else if (choose1 == 3) {
						bl = false;

					} else {
						System.out.println("Vui lòng chọn 1 hoặc 2 hoặc 3");
					}
					break;
				}
				break;

			case 2:
				f.Login();
				break;
			default:
				System.out.println("Vui lòng chọn 1 hoặc 2");
				break;
			}
		}

	}

}
