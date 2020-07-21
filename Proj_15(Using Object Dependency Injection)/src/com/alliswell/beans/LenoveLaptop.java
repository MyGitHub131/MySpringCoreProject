package com.alliswell.beans;

public class LenoveLaptop {
	private OS os2;

	public void setOs2(OS os2) {
		this.os2 = os2;
	}
	
	public void windows7(){
		os2.windows10();
		System.out.println("Hey please don't download this id :"+ os2 +" Actually it's totally paid source...");
	}

}
