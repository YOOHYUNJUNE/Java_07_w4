package com.reference.list;

import java.util.Arrays;

public class ListPractice6 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			// 1부터 10까지 랜덤 숫자 생성 및 대입
			arr[i] = 1 + (int) (Math.random() * 10);
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		
		double avr = (double) sum / arr.length;
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + avr);
	}

}
