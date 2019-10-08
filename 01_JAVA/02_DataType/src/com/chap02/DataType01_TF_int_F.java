package com.chap02;

public class DataType01_TF_int_F {
	public static void main(String[] args) {

		System.out.println("1. Boolean ");

		System.out.println(true);
		System.out.println(false);
		System.out.println();

		System.out.println("2. int ");
		System.out.println("100 ==> " + 100);
		System.out.println("100 + 100 ==> " + (100 + 100));
		System.out.println("100 + 100 + \"100\" ==> " + (100 + 100) + "100");
		System.out.println("\"100\" + 100 + 100 ==> " + "100" + 100 + 100); // "" + 연결해서 출력하는 문자열
		System.out.println("100 + 100 + \"100\"+100+100 ==> " + (100 + 100) + "100" + 100 + 100); // String class
		System.out.println("\"100\" + (100 + 100) ==> " + "100" + (100 + 100));
		System.out.println("10000000000L ==> " + 10000000000L);
		System.out.println();

		System.out.println("3. Float ");
		System.out.println("90.9f ==> " + 90.9f + "\t // 90.9d ==> " + 90.9d);
		System.out.println("-----------------");
		System.out.println("'A' ==> " + 'A'); //
		System.out.println("(int)'A' ==> " + (int) 'A'); //
		System.out.println("'A'+0 ==> " + ('A' + 0)); //

		System.out.println("'A' + 2 ==> " + ('A' + 2)); // single quote는 연산 가능 (python 에서는 class 끼리의 연산이라고 간주되기 때문에 연산이
														// 안됨)
		System.out.println("\"A\" + 2 ==> " + ("A" + 2));

	}
}
