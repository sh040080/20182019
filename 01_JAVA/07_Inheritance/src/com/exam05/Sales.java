package com.exam05;

import java.util.Scanner;

public class Sales {
	protected String article;
	protected int qty;
	protected int cost ;
	protected static int cnt ;
	protected static float discount ;
	protected Scanner sc;
	
	public Sales() {
		sc = new Scanner(System.in);
		System.out.println("품목");
		article = sc.next();
		System.out.println("수량");
		qty = sc.nextInt();
		System.out.println("단가");
		cost = sc.nextInt();
		cnt += qty;
		}

}
