package com.statement.loop;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputStr;
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("종료하려면 1를 입력하세요.");
				
		do {
			System.out.println("입력 : ");
			inputStr = sc.nextLine();
			System.out.println(inputStr + "을 입력했습니다.");
		} while (!inputStr.equals("1")); // Q를 입력하지 않으면 무한 반복
		System.out.println("종료");
		
		
	}
}
