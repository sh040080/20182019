package com.exam04;

public class Ch06_Exam04 {
	public static void main(String[] args) {
		SmartPhone smart[] = {
				new SmartPhone("삼성", "갤럭시노트", 850000),
				new SmartPhone("애플", "아이폰", 740000,30),
				new SmartPhone("삼성", "갤럭시 S", 750000,35)
		};
		
		int len = smart.length;
		System.out.println("==제품목록===");
		System.out.println("-------------");
		for (int i = 0; i<len ; i++) {
			System.out.println(smart[i].getName() + "["+ smart[i].getMaker()+"]");
			System.out.println("가격 : " + smart[i].getPrice());
			int discountPrice = smart[i].calculateDiscount();
			if(discountPrice != smart[i].getPrice()) {
				System.out.println("할인가격 : " +  discountPrice );
			}
			System.out.println("-------------");
		}
		
	}

}
