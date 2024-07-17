package com.statement.practice;

public class Practice6 {

	public static void main(String[] args) {
		for (int i=1;i<=100;i++) {
			System.out.print(i);
			if(i%3==0) {
				System.out.print(" three");
			}
			if(i%5==0) {
				System.out.print(" five");
			}
			if(i%7==0) {
				System.out.print(" seven");
			}
				System.out.println();
		}
		
//		for (int i = 1; i <= 100; i++) {
//			String result = i + "";
//			if (i % 3 == 0) {
//				result += " three";
//			}
//			if (i % 5 == 0) {
//				result += " five";
//			}
//			if (i % 7 == 0) {
//				result += " seven";
//			}
//			System.out.println(result);
//		}

//		for (int i = 1; i <= 100; i++) {
//			System.out.println(
//					i + 
//					(i % 3 == 0 ? " three" : "") +
//					(i % 5 == 0 ? " five" : "") +
//					(i % 7 == 0 ? " seven" : "")
//			);
//		}
	}

}
