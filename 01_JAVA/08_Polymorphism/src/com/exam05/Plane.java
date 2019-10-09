package com.exam05;

public abstract class Plane {
	
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		super();
	}
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int i) {
		setFuelSize(getFuelSize()+i);
		System.out.println(getPlaneName() + "\t\t" + getFuelSize()+"\n");
	}
	public abstract void flight(int i);

}
