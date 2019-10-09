package com.exam04;

public class SuperClass {
	int x;
	int y;
	int z;

	public SuperClass() {
		System.out.println("**** x,y,z에 값을 채워봅시다. ****");
	}

	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println(x + "를 넘겨 받은 생성자 입니다.");
	}

	public SuperClass(int x, int y) {
		this(x);
		this.y = y;
		System.out.println(x +"    " +y +"를 넘겨 받은 생성자 입니다.");
	}

	public SuperClass(int x, int y, int z) {
		this(x,y);
		this.z = z;
		System.out.println(x +"    " +y +"    "+z+"를 넘겨 받은 생성자 입니다.");
	}

	public void display() {
		System.out.println(this.x + "     "+ this.y +  "     "+ this.z );

	}

}
