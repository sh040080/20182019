package com.exam01;

public class Ch08_exam01 {

	public static void main(String[] args) {
		Circle[] obj = new Circle[] { new Circum(), new Area() };
		System.out.println("�ݰ�:" + 10 );
		for (Circle res : obj) {
			System.out.println(res.Calc(10));
		}
	}
}

class Circum implements Circle {
	public String Calc(double r) {
		double circum = 2.0 * Math.PI * r;
		return "�ѷ� : " + circum;
	}
}

class Area implements Circle {
	public String Calc(double r) {
		double area = Math.PI * r * r;
		return "����  : " + area;
	}
}