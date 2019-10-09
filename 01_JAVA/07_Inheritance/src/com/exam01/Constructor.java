package com.exam01;

class A {
	public A() {
		System.out.println("持失切 A");
	}

	public A(int a) {
		System.out.println("持失切 A" + a);
	}
}

class B extends A {
	public B(int a) {
		System.out.println("持失切 B" + a);
	}
}

public class Constructor {
	public static void main(String[] args) {
		A a = new A(10);
		System.out.println();
		B b = new B(11);
	}

}
