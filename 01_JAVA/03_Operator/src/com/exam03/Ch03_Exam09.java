package com.exam03;

public class Ch03_Exam09 {
	public static void main(String[] args) {
		int su = 45763 ;
		System.out.println("500�� : " + su/500 + "��");
		su %= 500;
		System.out.println("100�� : " + su/100 + "��");
		su %= 100;
		System.out.println("50�� : " + su/50 + "��");
		su %= 50;
		System.out.println("10�� : " + su/10 + "��");
		su %= 10;
		System.out.println("1�� : " + su + "�� �̴�.");
		
	}

}
