package com.exam01;

public class exam01 {
	public static void main(String[] args) {

		BookShop ob = new BookShop("Web/servlet", "Sung-A", 100000);

		System.out.println();
		System.out.println("å�̸�:" + ob.getBname());
		System.out.println("����:" + ob.getAuthor());
		System.out.println("����:" + ob.getPrice());

		System.out.println("\n <<������ �� ���>>\n");
		ob.setBname("�ȵ���̵� �̷��� �����սô�.");
		ob.setAuthor("Dominica");
		ob.setPrice(30000);

		System.out.println("å�̸�:" + ob.getBname());
		System.out.println("����:" + ob.getAuthor());
		System.out.println("����:" + ob.getPrice());

	}

}
