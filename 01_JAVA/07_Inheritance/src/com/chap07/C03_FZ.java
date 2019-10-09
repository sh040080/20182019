package com.chap07;

public class C03_FZ extends C02_BZ{

	private int f ;
	
	public C03_FZ() {}
	public C03_FZ(int f) {
		super();
		this.f=f;
	}
	public C03_FZ (int a , int b , int f) {
		super(a,b);
		this.f=f ;
	}
	
	public int getRes () {
		int r = getHap() - getF();
		return r;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	
	
}
