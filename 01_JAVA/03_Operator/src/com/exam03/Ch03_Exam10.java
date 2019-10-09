package com.exam03;

public class Ch03_Exam10 {
	public static void main(String[] args) {

		int F = 200;
		float C = (float) 5 / 9 * (F - 32);
		 C = (C*1000 %10 >= 5 ) ?  (int)(C*100 +1) / 100.f : (int)(C*100)/100.f ; 

		System.out.println("È­¾¾ : " + F);
		System.out.printf("¼·¾¾ : " + C);
	}

}
