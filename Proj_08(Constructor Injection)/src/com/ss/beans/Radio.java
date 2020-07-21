package com.ss.beans;

public class Radio {
	
	private IReceiver receiver;
	
	public Radio(IReceiver receiver)
	{
		this.receiver=receiver;
	}
	
	public void listen()
	{
		receiver.tune();
		System.out.println("Constructor Injection");
		System.out.println("listening ......");
	}

}
