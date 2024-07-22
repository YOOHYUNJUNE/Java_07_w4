package com.coding_test_4w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 일곱난쟁이 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 생성
		List<Integer> list = new ArrayList<> ();
//		int[] arr = new int[9];
		
		// 난쟁이 키 합
		int sum = 0;
		
		// 가짜 난쟁이
		int a = -1;
		int b = -1;
		
		// 난쟁이 9명 키 입력
		for (int i=0; i<9; i++) {
			int height = sc.nextInt();
			list.add(height);
			sum += list.get(i);
		}
//		System.out.println(list);
		
		for (int i=0; i<list.size()-1; i++) {
			for (int j=i+1; j<list.size(); j++) {
				if (sum - list.get(i) - list.get(j) == 100) {
					// 가짜의 순서
					a = i;
					b = j;
					break;
					}
				}
			// 가짜 난쟁이 찾으면 루프 종료
			if (a != -1 && b != -1) {
				break;
			}
		}
		
		// 20 7 23 19 10 15 25 8 13
//		System.out.println(list);
		
		Collections.sort(list);

		// 진짜 난쟁이 출력
		for (int i=0; i<list.size(); i++) {
			if(i == a || i == b) {
				continue;
			}
			System.out.println(list.get(i));
		}
		
		
		
	}
}
