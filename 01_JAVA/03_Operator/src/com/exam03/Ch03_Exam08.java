package com.exam03;

public class Ch03_Exam08 {
	public static void main(String[] args) {
		int egg = 456;
		int box = (egg%12 == 0) ? egg/12 : (egg/12)+1 ;

		System.out.println("달걀 "+ egg+"개를 12개씩 담을 수 있는 상자의 수는  "+ box +"개");
		
	}

}
