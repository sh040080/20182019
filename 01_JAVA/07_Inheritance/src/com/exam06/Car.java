package com.exam06;

public class Car {
	public String color;
	public int account;

	public Car(String color, int account) {
		super();
		this.color = color;
		this.account = account;
	}

	public String getColor() {
		return color;
	}

	public int getAccount() {
		return account;
	}

	@Override
	public String toString() {
		return "[����]" + color + "\t [�������]" + account + "\t";
	}

}
