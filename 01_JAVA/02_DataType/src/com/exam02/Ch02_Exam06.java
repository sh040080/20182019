package com.exam02;

public class Ch02_Exam06 {

	public static void main(String[] args) {
		//��������
		
		int kor, eng, mat, tot ;
		double avg ;
		String name ;
		
		// �� ����
		avg = 0.0 ; tot = 0 ;
		name = "ȫ�浿";
		kor = 90 ;
		eng = 83 ;
		mat = 72 ;
		
		// ����
		tot = kor + eng + mat ;
		avg = (double) tot / 3 ;
		
		// ��� 
		System.out.println("name : " + name);
		System.out.println("kor : "+ kor + "\t eng : "+ eng + "\t mat : " + mat);
		System.out.println("tot = " + tot + "\t avg = " + avg);
	}
}
