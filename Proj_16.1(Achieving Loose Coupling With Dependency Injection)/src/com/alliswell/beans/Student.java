package com.alliswell.beans;

public class Student {
	private Icheat icheat;

	/*public void setIcheat(Icheat icheat) {
		this.icheat = icheat;
	}*/

	public void cheatStarted() {
		icheat.cheat();
		System.out.println("Student doing a cheating...");
	}

	public Student(Icheat icheat) {
		this.icheat = icheat;
	}

}
