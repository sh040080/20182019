package com.exam01;

class A {
	public A() {
		System.out.println("������ A");
	}

	public A(int a) {
		System.out.println("������ A" + a);
	}
}

class B extends A {
	public B(int a) {
		System.out.println("������ B" + a);
	}
}

public class Constructor {
	public static void main(String[] args) {
		A a = new A(10);
		System.out.println();
		B b = new B(11);
	}

}
