package com.exam04;

public class Ch06_Exam04 {
	public static void main(String[] args) {
		SmartPhone smart[] = {
				new SmartPhone("�Ｚ", "�����ó�Ʈ", 850000),
				new SmartPhone("����", "������", 740000,30),
				new SmartPhone("�Ｚ", "������ S", 750000,35)
		};
		
		int len = smart.length;
		System.out.println("==��ǰ���===");
		System.out.println("-------------");
		for (int i = 0; i<len ; i++) {
			System.out.println(smart[i].getName() + "["+ smart[i].getMaker()+"]");
			System.out.println("���� : " + smart[i].getPrice());
			int discountPrice = smart[i].calculateDiscount();
			if(discountPrice != smart[i].getPrice()) {
				System.out.println("���ΰ��� : " +  discountPrice );
			}
			System.out.println("-------------");
		}
		
	}

}
