package com.exam04;

public class SuperClass {
	int x;
	int y;
	int z;

	public SuperClass() {
		System.out.println("**** x,y,z�� ���� ä�����ô�. ****");
	}

	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println(x + "�� �Ѱ� ���� ������ �Դϴ�.");
	}

	public SuperClass(int x, int y) {
		this(x);
		this.y = y;
		System.out.println(x +"    " +y +"�� �Ѱ� ���� ������ �Դϴ�.");
	}

	public SuperClass(int x, int y, int z) {
		this(x,y);
		this.z = z;
		System.out.println(x +"    " +y +"    "+z+"�� �Ѱ� ���� ������ �Դϴ�.");
	}

	public void display() {
		System.out.println(this.x + "     "+ this.y +  "     "+ this.z );

	}

}
