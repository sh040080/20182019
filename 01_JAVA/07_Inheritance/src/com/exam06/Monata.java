package com.exam06;

public class Monata extends Car{
	
	public String series;
	public String use;

	public Monata(String color, int account, String series , String use) {
		super(color, account);
		this.series = series;
		this.use = use;
	}

	@Override
	public String toString() {
		return super.toString() + " [�ø���]" + series + "\t [�뵵]" + use ;
	}
	
	

}
