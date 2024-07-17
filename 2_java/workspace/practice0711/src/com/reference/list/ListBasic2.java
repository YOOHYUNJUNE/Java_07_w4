package com.reference.list;

public class ListBasic2 {

	public static void main(String[] args) {
		int[] score = { 100, 70, 75, 43, 96 };
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("score["+i+"] 의 값은? -> "+ score[i]);
			sum += score[i];
		}
		
		System.out.println(sum);
	}

}
