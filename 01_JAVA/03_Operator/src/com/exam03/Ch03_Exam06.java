package com.exam03;

public class Ch03_Exam06 {
public static void main(String[] args) {
	
	int money = 65430 ;
	System.out.println( " ���� : " + (money/10000));
	money %= 10000;
	System.out.println( " õ�� : " + (money/1000));
	money %= 1000;
	System.out.println( " ��� : " + (money/100));
	money %= 100;
	System.out.println( " �ʿ� : " + (money/10));

			

}
}
