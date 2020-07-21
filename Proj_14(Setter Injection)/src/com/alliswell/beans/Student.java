package com.alliswell.beans;

public class Student {
	
	private int studentId;
	private String studentName;

	
	/*public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
*/

	
	
	/*@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + "]";
	}*/

	public void displayStudentInfo(){
		
		//System.out.println("Student name is: "+studentName+" and the id is: "+studentId);
		System.out.println("Student Name Is : " + studentName);
		System.out.println("Student Id Is : " +studentId);
	}


	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	
}
