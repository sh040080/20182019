package com.exam03;

public class Ch06_Exam03 {
	
	public static void main(String[] args) {
		Fruit [] f = new Fruit[4];
		 f[0] = new Fruit("jujube", 24000);
		 f[1] = new Fruit("strawberry", 21000);
		 f[2] = new Fruit("persimmon", 19000);
		 f[3] = new Fruit("cherry", 12000);
		
		int totalPrice =0 ;
		 for (int i = 0 ; i < f.length ; i++) {
			 totalPrice += f[i].getPrice();
		 }
		int savePrice = (int) (totalPrice*0.15);
		
		System.out.println("===========���ϱ��Ը��=========");
		 for (int i = 0 ; i < f.length ; i++) {
			System.out.println(f[i].getFname() + " : "+ f[i].getPrice());
		 }
		System.out.println("---------------------------");
		System.out.println("�ֹ� �� �ݾ� : "+ totalPrice+"��");
		System.out.println("������ ���� �ݾ�  : "+ (totalPrice - savePrice) + "��");
	}

}
