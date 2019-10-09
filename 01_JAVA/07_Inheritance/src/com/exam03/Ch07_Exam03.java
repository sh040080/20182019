package com.exam03;

public class Ch07_Exam03 extends Salary{
	String department ;
	
public Ch07_Exam03(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}



@Override
public void getInformation() {
	super.getInformation();
	System.out.println("ºÎ¼­ : " + department);
}


public static void main(String[] args) {
	
	Ch07_Exam03 ob = new Ch07_Exam03("Dominica", 850000, "ERP-*");
	ob.getInformation();
}
}
