package com.reference.list;

import java.util.Scanner;

public class ListPractice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수: ");
		int n = sc.nextInt();
		double[] doubleArr = new double[n];
		
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.print("doubleArr["+ i +"] = ");
			doubleArr[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for (double d : doubleArr) {
			sum += d;
		}
		
		System.out.println("모든 요소의 합은 "+ sum + "입니다.");
		System.out.println("모든 요소의 평균은 "+ sum / n + "입니다.");
	}

}
