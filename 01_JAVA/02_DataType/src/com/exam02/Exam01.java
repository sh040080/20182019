package com.exam02;

//아래와 같이 출력하되, 평균은 소수이하 한자리까지만 출력해라.

/*  이름 : 홍길동    String name
*  국어 : 100 *  수학 : 78 *  영어 : 81 int
*  총점 : ?
*  평균 : ?
*   ex) 총점 = 국어 + 수학 + 영어
*   ex) 평균 = (국어+수학+영어) / 3   = 총점 / 3
*/

public class Exam01 {
	public static void main(String[] args) {

		String name = "홍길동";
		int kor = 100, mat = 78, eng = 81, tot;
		double avg = 0.0;

		tot = kor + mat + eng;
		avg = (double) tot / 3;
		System.out.printf("이름 : %5S\n", name);
		System.out.printf("국어 : %3d   수학: %3d" + " 영어: %3d\n", kor, mat, eng);
		System.out.printf("총점 = %3d+%3d+%3d = %4d \n", kor, mat, eng, tot);
		System.out.printf("평균 = %3.1f", avg);

	}
}
