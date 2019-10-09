package com.exam05;

import java.util.Scanner;

public class Ch07_Exam05 extends Sales {
	int amount;

	public void setProcess() {
		amount = qty * cost;
	}

	public void getDisplay() {
		int price = amount - (int) (amount * discount);
		System.out.println(article + "    " + price + "원");
	}

	public static void setDiscount(float f) {
		discount = f;

	}

	public Ch07_Exam05() {
		super();
		setProcess();
	}

	public static void main(String[] args) {

		Ch07_Exam05[] op = new Ch07_Exam05[2];
		for (int i = 0; i < op.length; i++) {
			op[i] = new Ch07_Exam05();
		}
		Scanner sc = new Scanner(System.in);
		float dis = 0.0f;

		System.out.println("할인율 : ");
		dis = sc.nextFloat();
		Ch07_Exam05.setDiscount(dis);

		System.out.println("[판매가]");
		for (int k = 0; k < op.length; k++) {
			op[k].getDisplay();
		}
		System.out.println("판매건수 : " + cnt);
	}
}
