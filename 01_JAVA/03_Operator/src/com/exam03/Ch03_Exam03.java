package com.exam03;

public class Ch03_Exam03 {
	
	public static void main(String[] args) {
		boolean su01 = true;
		boolean su02 = false;
		int k = 0;
		
		System.out.println( "su01 && su02" );
		System.out.println( su01 && su02 );
		
		System.out.println("!su01");
		System.out.println(!su01);

		System.out.println("!(!su01)");
		System.out.println(!(!su01));

		k = (su01 && su02)? 0 : 3;   // k = False , k=3
		k = (k != 0) ? 10 : 5; // k != 0 True, k=10
		
		k%= 10; // k = 0;
		System.out.println( ++k); // k = 1;
		
	}
	

}
