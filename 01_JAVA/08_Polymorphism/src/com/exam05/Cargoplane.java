package com.exam05;

public class Cargoplane extends Plane {

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void flight(int i) {
		setFuelSize(getFuelSize() - ((i/10)*50));
		System.out.println(getPlaneName() + "\t\t" + getFuelSize()+"\n");

		
	}

}
