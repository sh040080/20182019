package com.exam03;

public class Ch03_Exam04 {
	public static void main(String[] args) {
		char ch = 'd';
		
		char upperCase = (ch >= 97) ?   (char) (ch - 32) : ch ;
		
		System.out.println( "lowerCase : " + ch);
		System.out.println("uppserCase : " + upperCase);
	}

}
