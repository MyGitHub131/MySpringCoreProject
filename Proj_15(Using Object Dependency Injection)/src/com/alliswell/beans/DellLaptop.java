package com.alliswell.beans;

public class DellLaptop {
	
	private int id;
	private OS os;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setOs(OS os) {
		this.os = os;
	}
	public void windows10(){
		os.windows10();
		System.out.println("Hey please download this id :"+ id +" Actually it's totally free open source...");
	}

}
