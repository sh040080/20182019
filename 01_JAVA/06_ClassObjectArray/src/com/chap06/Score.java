package com.chap06;

public class Score {
	public static void Prn_tot(int k, int m, int e) {
		int tot = k + m + e ;
			System.out.printf("ÃÑÁ¡ = %3d+%3d+%3d = %4d \n",k,m,e,tot) ;
			
	}
	public static void Prn_avg(int k, int m, int e ) {
		double avg = (double) (k+m+e) /3 ;
		System.out.printf("Æò±Õ : %5.2f \n", avg );
	}
}
