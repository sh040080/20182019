package com.exam07;

public class DvdShop {
	private Dvd[] dvdlist;
	
	public DvdShop(Dvd[] d) {
		dvdlist = new Dvd[d.length];
		for (int i = 0 ; i < d.length ; i++) {
			dvdlist[i] = d[i];
		}
	}
	public void printDvdlist() {
		System.out.println("Dvd ¸ñ·Ï=============");
		for (int i = 0; i<dvdlist.length ; i++) {
			System.out.println(dvdlist[i].getTitle() + dvdlist[i].getPrice());
		}
	}
	public void printTotalPrice() {
		System.out.println("====================");
		int sum = 0 ;
		for (int i = 0; i < dvdlist.length ; i++ ) {
			sum += dvdlist[i].getPrice();
		}
		System.out.println("ÃÑÇÕ°è : "+ sum);
		
	}
	
	

}
