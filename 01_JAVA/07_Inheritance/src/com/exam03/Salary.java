package com.exam03;

public class Salary {
	
	String name;
	int salary ;
	
	public Salary(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void getInformation() {
		System.out.println("�̸� : " + name);
		System.out.println("����: " + salary);
		
	}

}
