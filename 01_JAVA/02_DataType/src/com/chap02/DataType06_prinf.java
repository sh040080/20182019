package com.chap02;

//  printf(String format, object ... args)
public class DataType06_prinf {
	public static void main(String[] args) {

		System.out.printf("%c%c", 'A', 'B');
		System.out.printf("%10c %10c", 'A', 'B'); // 10�ڸ� �ڿ� char 1 + 10�ڸ� �ڿ� char
		System.out.printf("%10c %10c \n %c ", 'A', 'B', 'c'); // 10�ڸ� �ڿ� char 1 + 10�ڸ� �ڿ� char
		System.out.printf("\n %5d %10.2f \n", 100, 92.789); // �ٹٲٰ� + 5�ڸ� �ڿ� ���� 1 + 10�ڸ� �ڿ� �Ҽ��� �ڸ� 2�ڸ�����
		System.out.printf("\n %-5d %10.2f \n", 100, 92.789); // �ٹٲٰ� + 5�ڸ� �ڿ� ���� 1 + 10�ڸ� �ڿ� �Ҽ��� �ڸ� 2�ڸ����� (��������)
	}
}
