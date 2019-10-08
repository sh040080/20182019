package com.chap02;

public class DataType07_Unicode {

	public static void main(String[] args) {

		char ch = '\u0000';
		char end = '\uffff'; // �����ڵ� ����, �����ڵ����� �𸣴� ���, ��Ʈ�� ���� ���� �ȳ��� �� ����. int�� ��ȯ�ؼ� ������ ���� Ȯ��
		System.out.println("ch=" + (int) ch + " ~ " + (int) end);
		System.out.println("ch=" + ch + "~" + end);

		char f_name = '��';
		System.out.println(f_name + ":" + (int) f_name);

		char a = '\ubc15', b = '\uc131', c = '\uc544', d = '\n';
		System.out.printf("%C%C%C", a, b, c);
		System.out.printf("%C%C%C%C", a, d, b, c);
		System.out.printf("%C%C%C%C", a, d, b, c);
		String str = "\n\\ubc15\\uc131\\uc544";
		System.out.println(str);
		String strr = "\n\ubc15\uc131\uc544";
		System.out.println(strr);
		String str01 = null;
		System.out.println(str01);

		String str02 = null;
		str02 = "���¿��ð�������100%�̴�";
		System.out.println(str02);

		str02 = "���¿��ð�������100%%�̴�";
		System.out.println(str02);

		str02 = "���¿��ð�������'100%'�̴�";
		System.out.println(str02);

		str02 = "���¿��ð�������\"100%\"�̴�";
		System.out.println(str02);

	}

}
