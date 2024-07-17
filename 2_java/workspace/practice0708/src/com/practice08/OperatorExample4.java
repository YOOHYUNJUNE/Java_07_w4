package com.practice08;

import java.util.Scanner;

public class OperatorExample4 {

	public static void main(String[] args) {
		System.out.println('A' == 65);
		System.out.println('A' < 66);
		
		System.out.println(3.0 == 3);
		
		// !!! 실수타입은 정밀도 차이로 인해 정확한 비교가 안된다!!!
		// System.out.println(0.1 == 0.1f);
		// System.out.println(0.1 < 0.1f);
		System.out.println((float) 0.1 == 0.1f);
		
		// 문자열 비교는 비교연산자 사용이 불가능하다.
		// 참조데이터 타입은 값이 아닌 메모리 주소를 비교하기 때문에!!!
		String name1 = "최인규";
		String name2 = "최인";
		name2 = name2 + "규";
		// System.out.println(name1 == name2);
		
		// 따라서 문자열 비교는 비교연산자 대신 equals(), !equals()를 사용한다.
		System.out.println(name1.equals(name2));
		
		Scanner sc = new Scanner(System.in);
		String target = "Hello";
		System.out.print("비교 대상 문자열 입력: ");
		String input = sc.nextLine();
		
		System.out.println("target과 input의 연산자 비교 : " + (target == input));
		System.out.println("target과 input의 메소드 비교 : " + (target.equals(input)));
		
	}

}

