package com.alliswell.beans;

public class Employee {
	private int e_Id;
	private String e_Name;
	private String e_Address;
	private String e_MobileNo;
	private String e_Email;

	public void setE_Id(int e_Id) {
		this.e_Id = e_Id;
	}

	public void setE_Name(String e_Name) {
		this.e_Name = e_Name;
	}

	public void setE_Address(String e_Address) {
		this.e_Address = e_Address;
	}

	public void setE_MobileNo(String e_MobileNo) {
		this.e_MobileNo = e_MobileNo;
	}

	public void setE_Email(String e_Email) {
		this.e_Email = e_Email;
	}

	/*@Override
	public String toString() {
		return "Employee [e_Id=" + e_Id + ", e_Name=" + e_Name + ", e_Address="
				+ e_Address + ", e_MobileNo=" + e_MobileNo + ", e_Email="
				+ e_Email + "]";
	}*/

	public void displayEmployeeInfo() {
		System.out.println("Employee_Id : " + e_Id);
		System.out.println("Employee_Name : " + e_Name);
		System.out.println("Employee_MobileNo : " + e_MobileNo);
		System.out.println("Employee_Emsil : " + e_Email);
		System.out.println("Employee_Address : " + e_Address);
	}
	
}
