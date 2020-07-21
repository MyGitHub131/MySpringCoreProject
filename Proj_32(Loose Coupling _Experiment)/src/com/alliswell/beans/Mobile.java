package com.alliswell.beans;

public class Mobile {
	private ISimCard iSimCard = null;
	public String calling;

	public String missedCall;

	public String dataPack;

	public String msgDelivery;

	public String confrenceCall;

	public ISimCard getiSimCard() {
		return iSimCard;
	}

	public void setiSimCard(ISimCard iSimCard) {
		this.iSimCard = iSimCard;
	}

	public String getCalling() {
		return calling;
	}

	public void setCalling(String calling) {
		this.calling = calling;
	}

	public String getMissedCall() {
		return missedCall;
	}

	public void setMissedCall(String missedCall) {
		this.missedCall = missedCall;
	}

	public String getDataPack() {
		return dataPack;
	}

	public void setDataPack(String dataPack) {
		this.dataPack = dataPack;
	}

	public String getMsgDelivery() {
		return msgDelivery;
	}

	public void setMsgDelivery(String msgDelivery) {
		this.msgDelivery = msgDelivery;
	}

	public String getConfrenceCall() {
		return confrenceCall;
	}

	public void setConfrenceCall(String confrenceCall) {
		this.confrenceCall = confrenceCall;
	}

	public void simCallingActivated() {
		iSimCard.simActivated();
		System.out.println("Calling : " + calling + ", Missedcall : "
				+ missedCall + ", Datapack : " + dataPack + ", Msgdelivery : "
				+ msgDelivery + ", Confrencecall : " + confrenceCall);
	}
}
