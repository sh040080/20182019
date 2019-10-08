package com.chap02;

// byte 연습 
public class DataType02_byte {
	public static void main(String[] args) {

		byte a = 100;
		System.out.println("<변수선언>\nbyte a = " + a);
		System.out.println("a=" + a);
		System.out.println();
		
		a = 127;
		System.out.println("<재대입> \na = 127; \na = " + a);
		System.out.println();
		
		a = (byte) 129;
		System.out.println("<overflow> \na=(byte) 129;\na = " + a);
	}

}
