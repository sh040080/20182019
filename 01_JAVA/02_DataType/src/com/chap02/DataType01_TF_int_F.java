package com.chap02;

public class DataType01_TF_int_F {
	public static void main(String[] args) {

		System.out.println("1. Boolean ");

		System.out.println(true);
		System.out.println(false);
		System.out.println();

		System.out.println("2. int ");
		System.out.println("100 ==> " + 100);
		System.out.println("100 + 100 ==> " + (100 + 100));
		System.out.println("100 + 100 + \"100\" ==> " + (100 + 100) + "100");
		System.out.println("\"100\" + 100 + 100 ==> " + "100" + 100 + 100); // "" + �����ؼ� ����ϴ� ���ڿ�
		System.out.println("100 + 100 + \"100\"+100+100 ==> " + (100 + 100) + "100" + 100 + 100); // String class
		System.out.println("\"100\" + (100 + 100) ==> " + "100" + (100 + 100));
		System.out.println("10000000000L ==> " + 10000000000L);
		System.out.println();

		System.out.println("3. Float ");
		System.out.println("90.9f ==> " + 90.9f + "\t // 90.9d ==> " + 90.9d);
		System.out.println("-----------------");
		System.out.println("'A' ==> " + 'A'); //
		System.out.println("(int)'A' ==> " + (int) 'A'); //
		System.out.println("'A'+0 ==> " + ('A' + 0)); //

		System.out.println("'A' + 2 ==> " + ('A' + 2)); // single quote�� ���� ���� (python ������ class ������ �����̶�� ���ֵǱ� ������ ������
														// �ȵ�)
		System.out.println("\"A\" + 2 ==> " + ("A" + 2));

	}
}
