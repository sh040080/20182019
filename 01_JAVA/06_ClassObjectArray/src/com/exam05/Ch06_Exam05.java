package com.exam05;

public class Ch06_Exam05 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setEmpno(7777);
		m1.setEname("ȫ�浿");
		m1.setJob("������");
		m1.setHiredate("2012-1-1");
		m1.setSal(8000);

		Member m2 = new Member();
		m2.setEmpno(8888);
		m2.setEname("���浿");
		m2.setJob("����");
		m2.setHiredate("2012-1-3");
		m2.setSal(9000);

		System.out.println("ȸ���� �⺻����");
		System.out.println(m1.toString());
		System.out.println(m2.toString());

		System.out.println("\n ȫ�浿�� �Ի����� 4�� 5�Ϸ� ������ ���");
		m1.setHiredate("2012-4-5");
		System.out.println(m1.toString());

		System.out.println("\n ���浿�� ������ ȫ���� ���� �� ���");
		m2.setJob("ȫ��");
		System.out.println(m2.toString());

		System.out.println("\n ȫ�浿�� ���浿�� ������ ���� �� ���");
		int sum = m1.getSal() + m2.getSal();
		System.out.println("sum = " + sum);
	}
}
