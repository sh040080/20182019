package com.exam06;

public class Ch07_Exam06 {
	public static void main(String[] args) {

		Monata mt[] = { new Monata("���", 6000, "NF", "�¿�"),
				new Monata("����", 7000, "Brilliant", "����"),
				new Monata("��ȫ��", 4000, "EF", "�ý�"),
				new Monata("������", 5000, "Hybrid", "�¿�") };

		System.out.println(" ====================== MONATA ������� ==================");
		int len = mt.length;
		for (int i = 0; i < len; i++) {
			System.out.println(mt[i].toString());
		}
	}

}
