package com.coding_test_5w;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// 괄호 "( )" 열고 닫히면 YES / 아니면 NO 출력
		// true : YES / false : NO
		
		// "(" 입력시 false 저장, ")" 로 닫으면 true
		// 가장 처음에 ) 입력시 false
		
		Scanner sc = new Scanner(System.in);
		
		// 괄호를 넣을 배열
		List<String> arr = new LinkedList<>();

		// 괄호 입력 횟수
	//	System.out.println("괄호 테스트 데이터 횟수");
		int test = sc.nextInt();
		

		// 괄호 입력
		// ( 와 )에 각 0을 지정하고 괄호 입력이 끝나면 뺄셈
		int left = 0;
		int right = 0;
		
		sc.nextLine();
		for (int i=0; i<test; i++) {
		//	System.out.println("괄호를 입력하세요.");
			String b = sc.nextLine();
			arr.add(b);
			// 시작이 ) 인 경우 NO
			if (arr.get(i).charAt(0) == ')') {
				System.out.println("NO");
				// 시작 ( 인 경우
				
				// ())(() : YES로 출력됨
				// ( 처음 나왔을때, (개수보다 ))개수가 많이 나오면 NO가 나오게
				
			} else if (arr.get(i).charAt(0) == '(') {
				for (int j=0; j<arr.get(i).length(); j++) {
					if (arr.get(i).charAt(j) =='(') {
						left++;
			//			System.out.println("left : "+ left);
					} else if (arr.get(i).charAt(j) ==')') {
						right++;
			//			System.out.println("right : " + right);
					}
				}
				if (left - right == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				// 초기화
				left = 0;
				right = 0;
				
				
				
				
				
			}
		}
		
		
		
		
		
	}
}
