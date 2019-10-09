package com.exam06;

public class Ch07_Exam06 {
	public static void main(String[] args) {

		Monata mt[] = { new Monata("흰색", 6000, "NF", "승용"),
				new Monata("은색", 7000, "Brilliant", "업무"),
				new Monata("감홍색", 4000, "EF", "택시"),
				new Monata("검정색", 5000, "Hybrid", "승용") };

		System.out.println(" ====================== MONATA 생산시작 ==================");
		int len = mt.length;
		for (int i = 0; i < len; i++) {
			System.out.println(mt[i].toString());
		}
	}

}
