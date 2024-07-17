package com.oop.basic.practice04;

public class StudentExample {
	public static void main(String[] args) {
		// Student 객체를 3개 생성하여 배열에 넣는다 
		Student s1 = new Student("홍길동", 25, 171, 81);
		Student s2 = new Student("한사람", 23, 183, 72);
		Student s3 = new Student("임걱정", 26, 175, 65);
		Student[] sArr = {s1, s2, s3};
		
		int ageSum = 0;
		int heightSum = 0;
		int weightSum = 0;
		
		System.out.println("이름\t나이\t신장\t몸무게");
		// 배열의 객체 정보 모두 출력 (for)
		for (Student s : sArr) {
			System.out.println(s.name + "\t" + s.age + "\t" + s.height + "\t" + s.weight);
			ageSum += s.age;
			heightSum += s.height;
			weightSum += s.weight;
		}
		System.out.println();
		
		// ** 평균값은 소수점 3자리에 반올림하여 2자리까지 표현! Math.round
		
		
		// 나이의 평균 출력
		// 24.666666666666668 -> 25
		// 24.666666666666668 -> 2466.66666666666668 -> 2467 -> 24.67 
		System.out.println("나이의 평균: " + Math.round(ageSum / 3.0 * 100) / 100.0); 
		
		// 신장의 평균 출력
		System.out.println("신장의 평균: " + Math.round(heightSum / 3.0 * 100) / 100.0); 
		
		// 몸무게의 평균 출력
		System.out.println("몸무게의 평균: " + Math.round(weightSum / 3.0 * 100) / 100.0); 
	}
}
