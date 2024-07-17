package com.statement.condition;

public class IfPractice {
	public static void main(String[] args) {
		// 70 ~ 100까지의 숫자 중 랜덤숫자 반환
		int score = (int) (Math.random() * 30) + 71;
		System.out.println("점수 : " + score);
		String grade = "F";

		// 중첩 if를 이용하여 문제를 풀 것.
		// 바깥 if : 90점 이상은 A, 80점 이상은 B, 70점 이상은 C 등급을 부여한다.
		// 중첩 if : 95점, 85점, 75점을 기준으로 등급에 +를 붙인다.
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		}
		if (score % 10 >= 5 && score >= 70) {
			grade += "+";
		}
//		if (score >= 90) {
//			if (score >= 95) {
//				grade = "A+";
//			} else {
//				grade = "A";
//			}
//		} else if (score >= 80) {
//			if (score >= 85) {
//				grade = "B+";
//			} else {
//				grade = "B";
//			}
//		} else if (score >= 70) {
//			if (score >= 75) {
//				grade = "C+";
//			} else {
//				grade = "C";
//			}
//		}

		System.out.println("학점 : " + grade);

	}
}
