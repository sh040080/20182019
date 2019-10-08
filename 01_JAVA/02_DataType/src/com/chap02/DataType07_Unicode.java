package com.chap02;

public class DataType07_Unicode {

	public static void main(String[] args) {

		char ch = '\u0000';
		char end = '\uffff'; // 유니코드 문자, 유니코드인줄 모르는 경우, 폰트에 따라서 값이 안나올 수 있음. int로 변환해서 값으로 들어갔나 확인
		System.out.println("ch=" + (int) ch + " ~ " + (int) end);
		System.out.println("ch=" + ch + "~" + end);

		char f_name = '金';
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
		str02 = "나는오늘감성지수100%이다";
		System.out.println(str02);

		str02 = "나는오늘감성지수100%%이다";
		System.out.println(str02);

		str02 = "나는오늘감성지수'100%'이다";
		System.out.println(str02);

		str02 = "나는오늘감성지수\"100%\"이다";
		System.out.println(str02);

	}

}
