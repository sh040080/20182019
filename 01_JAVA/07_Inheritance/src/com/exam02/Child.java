package com.exam02;

public class Child extends Parent{
	int age ;
	float tall;
	
	public Child(String name, int age, float tall) {
		super(name);
		this.age = age;
		this.tall = tall;
	}
	
	public void printAll() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + tall);
		
	}

}
