package com.exam04;

public class Cat implements Countable {
private int number;
	@Override
	public int getCount() {
		return number;
	}

	@Override
	public void setCount(int acounter) {
number = acounter;		
	}
	
	

}
