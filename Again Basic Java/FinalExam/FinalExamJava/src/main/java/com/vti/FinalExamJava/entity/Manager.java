//
package com.vti.FinalExamJava.entity;

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
public class Manager {
	private User uId;
	private int mId;
	private int expInYear;

	public Manager() {
		super();
	}

	public Manager(int mId, int expInYear) {
		super();
		this.mId = mId;
		this.expInYear = expInYear;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;

	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;

	}

	public User getUser() {
		return uId;
	}

	public void setUser(User user) {
		this.uId = user;

	}

	public void input(User uId) {
		Scanner sc = new Scanner(System.in);
		this.uId = uId;
		System.out.println("ExpInt:");
		expInYear = ScannerUtil.readInt(sc, "Mời bạn nhập vào 1 số nguyên! \nVui lòng nhập lại: ");
	}

}
