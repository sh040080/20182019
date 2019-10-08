package com.chap02;

// char 연습
public class DataType04_char {

	public static void main(String[] args) {

		char ch = 100;
		System.out.println(ch);

		char ch02 = 'd';

		System.out.println("ch02 = ch02 ==> " + ch02);
		System.out.println("ch02 = ch02 + 100 ==> " + ch02 + 100);
		System.out.println("ch02 = (ch02+100) ==> " + (ch02 + 100));
		System.out.println("ch02 = ('d'+100) ==> " + ('d' + 100));
		System.out.println();

		System.out.println(" char res = ch + ch02 \n<error> : Type mismatch: cannot convert from int to char");
		System.out.println(
				"==> + 연산 후, 자료형 int 로 변경되어야 함 , but, 왼쪽 char res 에서 자료형을 char로 지정하면서, int(4byte)는 char(2byte)로 casting 될 수 없다는 메시지.");

		System.out.println();
		char res = (char) (ch + ch02);
		System.out.println("res = (char) (ch + ch02) ==> " + res);
		char res02 = 'd'+2 ;
		System.out.println("res02 =  'd'+2  ==> " + res02);

	}
}
