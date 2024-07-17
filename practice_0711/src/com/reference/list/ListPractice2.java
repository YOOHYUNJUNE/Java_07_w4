package com.reference.list;

import java.util.Scanner;

public class ListPractice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5]; // {0,0,0,0,0} 생성
		
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1 + "번째 점수 입력"); // 1번부터 순서대로 입력하세요.
			score[i] = Integer.parseInt(sc.next()); // score[] 에 순서대로 입력됨
		}
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i]; // sum에 score가 순서대로 더해짐
		}
		
		double avg = (double) sum / score.length; // score.length: score의 개수
		
		System.out.println("합계 : " + sum + ", 평균 : " + avg);
		
		
		
		
	}
}
