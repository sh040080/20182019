package com.chap02;

// char ����
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
				"==> + ���� ��, �ڷ��� int �� ����Ǿ�� �� , but, ���� char res ���� �ڷ����� char�� �����ϸ鼭, int(4byte)�� char(2byte)�� casting �� �� ���ٴ� �޽���.");

		System.out.println();
		char res = (char) (ch + ch02);
		System.out.println("res = (char) (ch + ch02) ==> " + res);
		char res02 = 'd'+2 ;
		System.out.println("res02 =  'd'+2  ==> " + res02);

	}
}
