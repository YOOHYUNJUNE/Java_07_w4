package com.reference.string;

import java.util.Scanner;

public class StringPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		String[] weatherArr = { "봄", "여름", "가을", "겨울" };
		do {
			System.out.print("주민등록번호를 입력하세요 : ");
			// Scanner로 주민등록번호를 입력받아라
			id = sc.nextLine();
			if (id.length() != 14)
				System.out.println("잘못된 입력입니다. 주민등록번호는 -를 포함한 14자리를 입력해주세요.");
		// 만약 자리수가 맞지 않으면, 계속 입력받으세요.
		} while (id.length() != 14);


		System.out.println("입력하신 주민등록번호는 " + id + " 입니다.");
		
		// 계절
		int month = Integer.parseInt(id.substring(2, 4));
		// switch
		String resultWeather = switch (month) {
			case 3, 4, 5 -> "봄";
			case 6, 7, 8 -> "여름"; 
			case 9, 10, 11 -> "가을";
			case 12, 1, 2 -> "겨울";
			default -> "에러"; 
		};
		
//		String resultWeather;
//		if (month >= 3 && month <= 5) {
//			resultWeather = "봄";
//		} else if (month >= 6 && month <= 8) {
//			resultWeather = "여름";
//		} else if (month >= 9 && month <= 11) {
//			resultWeather = "가을";
//		} else {
//			resultWeather = "겨울";
//		}
		
		// 성별
		char genderCode = id.charAt(7);
		String resultGender = genderCode % 2 == 0 ? "여자" : "남자";
		
		// 연도
		String year = id.substring(0, 2);
		String resultYear  = genderCode >= '3' ? "20"+year :"19"+year;
		
		System.out.println(resultYear + "-" + resultWeather  + "-" + resultGender);
	}

}
