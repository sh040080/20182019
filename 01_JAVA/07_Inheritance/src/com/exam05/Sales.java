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
		System.out.println("ǰ��");
		article = sc.next();
		System.out.println("����");
		qty = sc.nextInt();
		System.out.println("�ܰ�");
		cost = sc.nextInt();
		cnt += qty;
		}

}
