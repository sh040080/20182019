package com.exam07;

public class DvdTest {

	public DvdTest() {
		super();
	}

	public static void main(String[] args) {
		Dvd[] b = new Dvd[3];
		b[0] = new Dvd("이클립스", 3000);
		b[1] = new Dvd("스카이폴 ", 4000);

		b[2] = new Dvd();
		b[2].setTitle("인셉션");
		b[2].setPrice(5000);
		
		DvdShop bm = new DvdShop(b);
		bm.printDvdlist();
		bm.printTotalPrice();
	
	
	}
}
