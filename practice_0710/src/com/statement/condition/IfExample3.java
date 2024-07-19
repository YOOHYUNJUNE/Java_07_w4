package com.statement.condition;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("A 등급 합격입니다.");
		} else if (score >= 80) {
			System.out.println("B 등급 합격입니다.");
		} else if (score >= 70) {
			System.out.println("C 등급 합격입니다.");
		} else if (score >= 60) {
			System.out.println("D 등급 합격입니다.");
		} else {
			System.out.println("F 등급 불합격입니다.");
		}
	}
}
