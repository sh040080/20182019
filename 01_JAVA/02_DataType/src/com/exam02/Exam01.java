package com.exam02;

//�Ʒ��� ���� ����ϵ�, ����� �Ҽ����� ���ڸ������� ����ض�.

/*  �̸� : ȫ�浿    String name
*  ���� : 100 *  ���� : 78 *  ���� : 81 int
*  ���� : ?
*  ��� : ?
*   ex) ���� = ���� + ���� + ����
*   ex) ��� = (����+����+����) / 3   = ���� / 3
*/

public class Exam01 {
	public static void main(String[] args) {

		String name = "ȫ�浿";
		int kor = 100, mat = 78, eng = 81, tot;
		double avg = 0.0;

		tot = kor + mat + eng;
		avg = (double) tot / 3;
		System.out.printf("�̸� : %5S\n", name);
		System.out.printf("���� : %3d   ����: %3d" + " ����: %3d\n", kor, mat, eng);
		System.out.printf("���� = %3d+%3d+%3d = %4d \n", kor, mat, eng, tot);
		System.out.printf("��� = %3.1f", avg);

	}
}
