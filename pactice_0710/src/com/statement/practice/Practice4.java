package com.statement.practice;

public class Practice4 {
	public static void main(String[] args) {
		// 주사위 3개 던졌을 때, 곱이 3의 배우인 값을 출력
		// 1 * 1 * 3 = 3
		// 1 * 1 * 6 = 6
		for (int d1=1; d1<=6; d1++) {
			for (int d2=1; d2<=6; d2++) {
				for (int d3=1; d3<=6; d3++) {
					if (d1*d2*d3 % 3 == 0) {
						System.out.println(d1 + "x" + d2 + "x" + d3 + "=" + d1*d2*d3);
					}
				}
			}
		}
		
		// 3의 배수인 경우, 무조건 하나가 3 또는 6이어야 함
		for (int d1=1; d1<=6; d1++) {
			for (int d2=1; d2<=6; d2++) {
				for (int d3=1; d3<=6; d3++) {
					if (d1%3 == 0 || d2%3 == 0 || d3%3 == 0) {
						System.out.println(d1 + "x" + d2 + "x" + d3 + "=" + d1*d2*d3);
					}
				}
			}
		}
		
		
	}
}
