package com.practice08;

import java.util.Scanner;

public class OperatorExample4 {
	public static void main(String[] args) {
		System.out.println('A' == 65);
		System.out.println('A' < 65);
		
		System.out.println("---------------------------");
		
		// 정수 부분으로 비교
		System.out.println(3 == 3.0);
		System.out.println(3.0 == 3);
		
		System.out.println("---------------------------");

		
		// 실수는 정밀도 차이로 정확한 비교가 안됨
		System.out.println(0.1 == 0.1f);
		System.out.println(0.1 < 0.1f);
		System.out.println(0.1 > 0.1f);
		System.out.println((float) 0.1 == 0.1f);
		
		System.out.println("---------------------------");

		
		// 문자열 비교: 비교연산자 사용 불가
		// 참조 데이터 타입은 값이 아닌 메모리 주소를 비교하기 때문.
		String name1 = "유현준";
		String name2 = "유현준";
		String name3 = "유현";
		System.out.println(name1 == name2);
		name2 = name3 + "준";
		System.out.println(name1 == name2);
		// 문자열 비교는 비교연산자 대신 equals(), !equals 사용
		System.out.println(name1.equals(name2));
		
		Scanner sc = new Scanner(System.in);
		String target = "Hello";
		System.out.println("비교 대상 문자열 입력");
		String input = sc.nextLine();
		
		// Hello 입력
		System.out.println("target과 input의 연산자 비교 : " + (target == input));
		System.out.println("target과 input의 메소드 비교 : " + (target.equals(input)));
		
		
		
	}
}
