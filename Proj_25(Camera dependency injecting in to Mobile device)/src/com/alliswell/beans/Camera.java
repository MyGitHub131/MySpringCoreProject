package com.alliswell.beans;

public class Camera {
	private String nameOfCamera;
	private int noOfCamera;

	public String getNameOfCamera() {
		return nameOfCamera;
	}

	public void setNameOfCamera(String nameOfCamera) {
		this.nameOfCamera = nameOfCamera;
	}

	public int getNoOfCamera() {
		return noOfCamera;
	}

	public void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

	public void Activate() {
		System.out.println("Your mobile camera mode is activated !!");
		System.out.println("Now you can capture photo...");
	}
}
