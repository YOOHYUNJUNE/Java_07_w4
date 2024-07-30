package com.coding_test_5w;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 괄호 {
	public static void main(String[] args) {
		
		// 괄호 "( )" 열고 닫히면 YES / 아니면 NO 출력
		// true : YES / false : NO
		
		// "(" 입력시 false 저장, ")" 로 닫으면 true
		// 가장 처음에 ) 입력시 false
		
		Scanner sc = new Scanner(System.in);
		
		// 괄호를 넣을 배열
		List<String> arr = new ArrayList<>();


		// 괄호 입력 횟수
		System.out.println("괄호 테스트 데이터 횟수");
		int test = sc.nextInt();
		

		// 괄호 입력
		// ( 와 )에 각 0을 지정하고 괄호 입력이 끝나면 뺄셈
		// ( 처음 나왔을때, (개수보다 ))개수가 많이 나오면 NO가 나오게 : 
		int left = 1;
		int right = -1;
		
		// NO일 경우 지나치게 하기
		boolean yes = true;
		
		sc.nextLine();
		for (int i=0; i<test; i++) {
			System.out.println("괄호를 입력하세요.");
			String b = sc.nextLine();
			arr.add(b);
			// 시작 ) 인 경우 NO
			if (arr.get(i).charAt(0) == ')') {
				System.out.println("NO");
				yes = false;

				// 시작 ( 인 경우
			} else if (arr.get(i).charAt(0) == '(') {
				for (int j=0; j<arr.get(i).length(); j++) {
					// 괄호 입력에 따라 + 또는 -
					if (arr.get(i).charAt(j) =='(') {
						left++;
					} else if (arr.get(i).charAt(j) ==')') {
						right--;
					}
					
					
					// arr.get(1)부터 )가 2번 이상 나오면 무조건 NO
					if (arr.get(i).length() > j+2) {
						if(arr.get(i).charAt(j+1) == ')' && arr.get(i).charAt(j+2) == ')') {
							System.out.println("NO");
							yes = false;
						}
					} 
				
					
				} // j 반목문 끝
				
				
				if (yes) {
				if (left + right == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				}
				// 초기화
				left = 1;
				right = -1;
			}
		}
		
		
		
		
	}
}
