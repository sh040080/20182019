package com.exam03;

public class Ch03_Exam08 {
	public static void main(String[] args) {
		int egg = 456;
		int box = (egg%12 == 0) ? egg/12 : (egg/12)+1 ;

		System.out.println("�ް� "+ egg+"���� 12���� ���� �� �ִ� ������ ����  "+ box +"��");
		
	}

}
