package com.exam04;

public class Ch08_Exam04 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();

// is-a ���� 
		Countable[] objs = { dog, cat };

// interface method ���
		objs[0].setCount(10);
		objs[1].setCount(2);

		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i].getCount());
		}
	}

}
