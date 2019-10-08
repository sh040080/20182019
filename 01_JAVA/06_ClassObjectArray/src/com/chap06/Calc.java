package com.chap06;

public class Calc {
	public static void Hap(int a, int b) {
		System.out.printf(" %3d + %3d = %5d \n", a,b,(a+b));
	}
	public static void Sub(int a, int b) {
		System.out.printf(" %3d - %3d = %5d \n", a,b,(a-b));
	}
	public static void Gop(int a, int b) {
		System.out.printf(" %3d * %3d = %5d \n", a,b,(a*b));
	}
	public static void Div(int a, int b) {
		System.out.printf(" %3d / %3d = %5d \n", a,b,(a/b));
	}

}
