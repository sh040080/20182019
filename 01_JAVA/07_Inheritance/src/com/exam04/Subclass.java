package com.exam04;

public class Subclass extends SuperClass{

	public Subclass(int x, int y, int z) {
		super(x, y, z);
		super.display();
		this.sumData();
	}
	
	public void sumData() {
		System.out.println("гу : " + (x + y+ z));
		
	}

}
