package com.exam03;

public class Ch03_Exam01 {
	public static void main(String[] args) {
		int x = 2 ;
		int y = 5;
		char c = 'A';
		System.out.print ( " y >= 5 || x<0 && x>2  >>>  " );
		System.out.println( y >= 5 || x<0 && x>2 );

		System.out.print ("y += 10 - x++    >>>  ");// y = 15 - 2 = 13 // x=3
		System.out.println(y += 10 - x++);

		System.out.print ("x += 2    >>>  "); // x=5
		System.out.println(x += 2); 
		
		System.out.print ( "!('A' <=c && c <= 'Z')    >>>  "); // 'A' <=c , T // c <= 'Z', T >> F
		System.out.println( !('A' <=c && c <= 'Z'));  

		
		
	}
}
