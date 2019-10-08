package com.chap02;

//  printf(String format, object ... args)
public class DataType06_prinf {
	public static void main(String[] args) {

		System.out.printf("%c%c", 'A', 'B');
		System.out.printf("%10c %10c", 'A', 'B'); // 10자리 뒤에 char 1 + 10자리 뒤에 char
		System.out.printf("%10c %10c \n %c ", 'A', 'B', 'c'); // 10자리 뒤에 char 1 + 10자리 뒤에 char
		System.out.printf("\n %5d %10.2f \n", 100, 92.789); // 줄바꾸고 + 5자리 뒤에 정수 1 + 10자리 뒤에 소숫점 자리 2자리까지
		System.out.printf("\n %-5d %10.2f \n", 100, 92.789); // 줄바꾸고 + 5자리 뒤에 정수 1 + 10자리 뒤에 소숫점 자리 2자리까지 (왼쪽정렬)
	}
}
