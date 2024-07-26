package com.coding_test_5w;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 제로 {
	public static void main(String[] args) {
		
		// 첫 줄 돈 액수 부르는 값 a
		// 0을 부를경우, 최근 자연수를 제거
		// 최종 합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 정수 개수 : ");
		int a = sc.nextInt();
		
		// 재현이가 부르는 값 n을 배열에 넣기
		// 삭제 될 수 있게 ArrayList<>();
		List<Integer> arr = new ArrayList<>();
		for (int i=0; i<a; i++) { 
			System.out.println("재현이가 부를 값");
			int n = sc.nextInt();
			arr.add(n); // arr에 값 보관됨		
		}
			// 0을 (연속으로) 부르는 경우 : 최근 n != 0 삭제, 0도 삭제
			
			// 최근 수의 인덱스 : arr.get(i--)하면서 n != 0 
			// 1 2 0 4 5 : 1 4 5
			// 1 2 0 0 5 : 5
			// 1 2 3 0 5 0 0 8 : 1 8
			
		// 0 앞에 0이 아닌 수가 있으면, 그 수와 0을 제거하는 방법으로
		
//		System.out.println(arr);
		
		// 보관된 배열을 조회
		for (int i=0; i<arr.size(); i++) {
			// 0이 있을 경우
			if (arr.get(i) == 0) {
				if (i > 0) { // 처음부터 0이 나오면 안됨, 이전 값도 0이 아닌 경우
				arr.remove(i-1); // 0 앞의 값 제거
				i--; // 이전 인덱스로 이동
			}
				arr.remove(i); // 0 제거
				i--; // 제거된 0자리의 수를 확인하기 위함
			}			
		}
		
		// 합계
		int sum = 0;		
		
		for (int number : arr)
			sum += number;
		
		System.out.println(sum);
		
		
		
		
		
		}
	}