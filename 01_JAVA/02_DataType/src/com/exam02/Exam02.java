package com.exam02;

//값을 받으면 출력하는 메소드를 만들어보자.
public class Exam02 {
	public static void Prn_A(int a) {
		System.out.println("Prn_A: " + a);
	}

	public static void Prn_B(double d) {
		System.out.println("Prn_B: " + d);
	}

	public static void Prn_C(char c) {
		System.out.println("Prn_C: " + c);
	}

	public static void Prn_D(String d) {
		System.out.println("Prn_D: " + d);
	}

	public static void Prn_E(char a, String b) {
		System.out.println("Prn_E: " + a + "," + b);
	}

	public static void Prn_F(boolean a, boolean b) {
		System.out.println("Prn_F: " + a + "," + b);
	}

	public static void main(String[] args) {

		Prn_A(1000);
		Prn_B(90.9);
		Prn_C('A');
		Prn_D("sung-a");
		Prn_E('b', "abab");
		Prn_F(true, false);

	}

}