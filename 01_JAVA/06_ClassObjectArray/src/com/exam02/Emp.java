package com.exam02;

public class Emp {

	 private String empno;
	 private int gi;
	 private double se;
	 private double su;
	 private double bong;
	 private String grad;
	 
	 
	public Emp() {
		super();
	}


	public Emp(String empno, int gi) {
		super();
		this.empno = empno;
		this.gi = gi;
		this.se = gi*0.2;
		this.su = gi*0.15;
		this.bong = gi-se+su;
	}


	public String getEmpno() {
		return empno;
	}


	public void setEmpno(String empno) {
		this.empno = empno;
	}


	public int getGi() {
		return gi;
	}


	public void setGi(int gi) {
		this.gi = gi;
	}


	public double getSe() {
		return se;
	}


	public double getSu() {
		return su;
	}


	public String getGrad() {
		if (this.bong >= 500000) {
			return "관리";
		} else { return "영업" ;}
		
	}


	public void setBong(double bong) {
		this.bong = bong;
	}


	@Override
	public String toString() {
		return empno +"|"+ gi +"|" + su +"|"+ se + "|"+ bong + "|" + getGrad()
				+ "]";
	}
	 
	 
	 
}
