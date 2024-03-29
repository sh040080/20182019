package com.exam05;

public class Member {
	private int empno ;
	private String ename;
	private String job;
	private String hiredate;
	private int sal;
	
	public Member () {}
	public Member(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}
	
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return empno + "   " + ename +  "   " + job +  "   " + hiredate + "   "+ sal;
	}
	
	

}
