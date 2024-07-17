package com.reference.list;

import java.util.Scanner;

public class ListPractice7 {
	public static void main(String[] args) {
		// double형 배열의 모든 요소의 합과 평균
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 길이를 입력하세요.");
		int arrLength = sc.nextInt();
		
		double[] arr = new double[arrLength];
		System.out.println("배열에 넣을 수를 입력하세요.");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print("arr[" + i + "] : ");
			double inputNum = sc.nextDouble();
			arr[i] = inputNum;
		}
		
		double sum = 0;
		
		for(double s : arr) {
			sum += s;
		}
		System.out.println("합 : " + sum + ", 평균 : " + sum/arr.length);
		
		
		
	}
}
