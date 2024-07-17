package com.statement.condition;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
//		char grade = (char) ((Math.random() * 10) + 'A');
		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하세요: ");
		char grade = sc.nextLine().charAt(0);
		
		System.out.println("등급: " + grade);
		switch (grade) {
			case 'A':
			case 'a':
				System.out.println("훌륭합니다!");
				break;
			case 'B' | 'b':
				System.out.println("좋습니다!");
				break;
			case 'C':
				System.out.println("나쁘지 않습니다!");
				break;
			case 'D':
				System.out.println("조금 아쉽습니다!");
				break;
			case 'E':
				System.out.println("나쁩니다!");
				break;
			case 'F':
				System.out.println("실패했습니다!");
				break;
			default:
				System.out.println("잘못된 등급입니다!");
		}
	}

}
