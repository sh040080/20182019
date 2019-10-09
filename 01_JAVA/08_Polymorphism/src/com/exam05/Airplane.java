package com.exam05;

public class Airplane extends Plane{

	public Airplane() {
		super();
	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int i) {
		setFuelSize(getFuelSize() - ((i/10)*30));
		System.out.println(getPlaneName() + "\t\t" + getFuelSize()+"\n");
	}

}
