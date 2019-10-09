package com.chap07;

public class C02_BZ extends C01_AZ {
	private int b;

	public C02_BZ() {
	}

	public C02_BZ(int b) {
		super();
		this.b = b;
	}
	
	public C02_BZ (int a, int b)	{
		super (a);
		this.b=b ;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int getHap() {
		int Hap = getA() + getB() ;
		return Hap;
	}
}
