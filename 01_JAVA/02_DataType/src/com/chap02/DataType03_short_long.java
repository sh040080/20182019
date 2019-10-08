package com.chap02;

// short(2), int(4), long(8)
public class DataType03_short_long {

	public static void main(String[] args) {

		short s = 100;
		System.out.println("s=" + s);

		s = 200; // 재대입
		System.out.println("s=" + s);

		int s1 = 200;
		System.out.println("s=" + s1);
		System.out.println(0x100 + ":" + 0100); // 접두어를 붙이면 진법이 변경됨

		s1 = 0x100;
		System.out.println(s1);
	}

}
