package com.chap02;

// byte ���� 
public class DataType02_byte {
	public static void main(String[] args) {

		byte a = 100;
		System.out.println("<��������>\nbyte a = " + a);
		System.out.println("a=" + a);
		System.out.println();
		
		a = 127;
		System.out.println("<�����> \na = 127; \na = " + a);
		System.out.println();
		
		a = (byte) 129;
		System.out.println("<overflow> \na=(byte) 129;\na = " + a);
	}

}
