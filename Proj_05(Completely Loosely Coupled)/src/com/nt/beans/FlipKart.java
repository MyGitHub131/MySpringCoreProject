package com.nt.beans;

import java.util.Random;

public class FlipKart {
	private Courier courier;
	
	public FlipKart(){
		System.out.println("FlipKart:0-param cosntructor");
	}
	
	//setter method for setter injection
	public void setCourier(Courier courier){
		System.out.println("FlipKart:setCourier(-)");
		this.courier=courier;
	}
	public String purchase(String items[]){
		//generate order id
		Random rad=new Random();
		int orderid=rad.nextInt(700000);
		// deliver order
 		String status=courier.deliver(orderid);
 		
		return status+ "Bill Amt for order id"+orderid+" is 7000"; 
		
	}//method
	
}//class

