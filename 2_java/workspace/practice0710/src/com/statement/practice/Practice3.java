package com.statement.practice;

public class Practice3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				// 두 개의 주사위 합이 6이 되는 경우
				if (i + j == 6) {
					System.out.println(i + "+" + j + "=" + (i + j));
					break;
				}
			}
		}
	}
}
