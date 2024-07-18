package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		
		final int HUNDRED = 100;
		Scanner sc = new Scanner(System.in);
		
		// 무한 반복
		while(true) {
			System.out.print("숫자 입력(종료를 원하면 '종료'입력) : \t");
			String input = sc.next();
			
			if (input.equals("종료") || Integer.parseInt(input) == 100) {
				break;
			}
			
		// 예외 발생할 수 있는 구역
			try {			
			
//				System.out.print("숫자를 입력하세요.\t");
//				int number = sc.nextInt();
	//			int number = (int) (Math.random()*10);
				
				int number = Integer.parseInt(input);
				
				double result = divide(HUNDRED, number);
//				System.out.println("숫자 : " + number);
				System.out.println(result);
			
			// 예외 발생 시 실행 코드
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				e.printStackTrace();
			} catch (NumberFormatException e) {	
				System.out.println("숫자를 입력해주세요.");
			// finally : 예외 발생 여부 관계없이, 항상 실행되는 코드 포함
//			} finally {
//				System.out.println("종료합니다.");
//				sc.close();
			}
		}
		sc.close();
		System.out.println("종료합니다.");
	}
	
	
	private static int divide(int x, int y) {
		int result = 0;
		try {
			result = x / y;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
}
