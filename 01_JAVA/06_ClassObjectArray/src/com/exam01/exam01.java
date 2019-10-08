package com.exam01;

public class exam01 {
	public static void main(String[] args) {

		BookShop ob = new BookShop("Web/servlet", "Sung-A", 100000);

		System.out.println();
		System.out.println("책이름:" + ob.getBname());
		System.out.println("저자:" + ob.getAuthor());
		System.out.println("가격:" + ob.getPrice());

		System.out.println("\n <<값변경 후 출력>>\n");
		ob.setBname("안드로이드 이렇게 시작합시다.");
		ob.setAuthor("Dominica");
		ob.setPrice(30000);

		System.out.println("책이름:" + ob.getBname());
		System.out.println("저자:" + ob.getAuthor());
		System.out.println("가격:" + ob.getPrice());

	}

}
