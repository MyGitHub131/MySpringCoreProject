package com.alliswell.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MobileDevice {
	@Autowired
	@Qualifier("sonycameraObjectValue")
	private Camera camera;

	public void cameraModeActivate() {
		if (camera != null) {
			camera.Activate();
			System.out.println("Name of camera : " + camera.getNameOfCamera());
			System.out.println("No of camera : " + camera.getNoOfCamera());
		} else {
			System.out.println("Mobile battery has dead !!");
		}
	}
}
