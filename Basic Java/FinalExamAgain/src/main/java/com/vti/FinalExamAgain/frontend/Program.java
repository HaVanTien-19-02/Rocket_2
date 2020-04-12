//
package com.vti.FinalExamAgain.frontend;

import java.util.Scanner;

/**
 * This class is main program. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 12-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 12-04-2020
 */
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function function = new Function();
		System.out.println("1.Register");
		System.out.println("2.Login");
		int c = sc.nextInt();
		switch(c){
		 case 1: 
			 function.createUser();
			 break;
		 case 2: 
			 function.Login();
			 break;
	     default:
	    	 System.out.println("Nhap lai");
		}
	}
}
