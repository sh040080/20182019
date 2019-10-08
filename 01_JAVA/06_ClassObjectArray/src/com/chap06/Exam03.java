package com.chap06;
// 아래와 같이 출력하되, 평균은 소수이하 한자리까지만 출력해라.

/*  이름 : 홍길동    String name
*  국어 : 100 *  수학 : 78 *  영어 : 81 int
*  총점 : ?
*  평균 : ?
*   ex) 총점 = 국어 + 수학 + 영어
*   ex) 평균 = (국어+수학+영어) / 3   = 총점 / 3
*/

public class Exam03 {
	public static void main(String[] args) {

		String name = "홍길동";
		int kor = 100, mat = 78, eng = 81;

		System.out.println(name + "님, 성적을 말씀드리겠습니다.");
		System.out.printf("국어 : %5d 수학: %5d" + " 영어: %5d\n", kor, mat, eng);
		Score.Prn_tot(kor, mat, eng);
		Score.Prn_avg(kor, mat, eng);

	}
}
