package com.exam03;

public class Ch03_Exam09 {
	public static void main(String[] args) {
		int su = 45763 ;
		System.out.println("500원 : " + su/500 + "개");
		su %= 500;
		System.out.println("100원 : " + su/100 + "개");
		su %= 100;
		System.out.println("50원 : " + su/50 + "개");
		su %= 50;
		System.out.println("10원 : " + su/10 + "개");
		su %= 10;
		System.out.println("1원 : " + su + "개 이다.");
		
	}

}
