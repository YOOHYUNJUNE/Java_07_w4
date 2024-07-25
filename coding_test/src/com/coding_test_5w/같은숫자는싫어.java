package com.coding_test_5w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 같은숫자는싫어 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 arr 각 숫자 0~9 , 배열 크기 : 100만 이하 자연수
		// 중복 제거 후 남은 원소의 순서 유지
		List<Integer> arr = new ArrayList<>();
		
		// 값 입력 ( 0 ~ 9 )
		int len = 10; // 배열 길이 임의 설정
		for (int i=0; i<len; i++) {
//			System.out.println("배열에 넣을 수를 정하세요.");
			int n = sc.nextInt();
			arr.add(n);
		}
		System.out.println(arr);

		
		// arr를 배열로 변환
		int[] arr1 = arr.stream().mapToInt(a -> a.intValue()).toArray();
//		System.out.println(Arrays.toString(arr1));
		
		// 중복 제거할 새로운 배열 생성
		List<Integer> arr2 = new ArrayList<>();
		
		// arr2에 arr1 입력과 중복 제거
		for (int i=1; i<arr1.length; i++) {
			if (arr1[i] != arr1[i-1]) {
				arr2.add(arr1[i]);
			}
		}
		
		// 처음 제거되는 arr1[0] 추가
		arr2.add(arr1[0]);
		
		System.out.println(arr2);
		
		// 중복 제거
//		System.out.println(arr.stream().distinct().toList());
		

		
		
		
		
		
		
	}
}
