//
package com.vti.template.entity;

/**
 * This class is Employee. 
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 25-03-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 25-03-2020
 */
public class Employee extends User{
	private String projectName;
	private String ProSkill;
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return ProSkill;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	
	}
	/**
	 * @param proSkill the proSkill to set
	 */
	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
		
	}
	

}
