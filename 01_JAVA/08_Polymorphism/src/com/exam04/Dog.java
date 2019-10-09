package com.exam04;

public class Dog implements Countable {
	private int counter;

	@Override
	public int getCount() {
		return counter;
	}

	@Override
	public void setCount(int acounter) {
		counter = acounter;
	}

}
