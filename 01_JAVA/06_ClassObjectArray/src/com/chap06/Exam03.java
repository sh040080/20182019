package com.chap06;
// �Ʒ��� ���� ����ϵ�, ����� �Ҽ����� ���ڸ������� ����ض�.

/*  �̸� : ȫ�浿    String name
*  ���� : 100 *  ���� : 78 *  ���� : 81 int
*  ���� : ?
*  ��� : ?
*   ex) ���� = ���� + ���� + ����
*   ex) ��� = (����+����+����) / 3   = ���� / 3
*/

public class Exam03 {
	public static void main(String[] args) {

		String name = "ȫ�浿";
		int kor = 100, mat = 78, eng = 81;

		System.out.println(name + "��, ������ �����帮�ڽ��ϴ�.");
		System.out.printf("���� : %5d ����: %5d" + " ����: %5d\n", kor, mat, eng);
		Score.Prn_tot(kor, mat, eng);
		Score.Prn_avg(kor, mat, eng);

	}
}
