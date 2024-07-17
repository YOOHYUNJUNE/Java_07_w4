package com.statement.loop;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		while (i <= 100) {
			sum += i++; // i -> 100이 되면 종료
		}
		System.out.println("sum = " + sum);
	}
}
