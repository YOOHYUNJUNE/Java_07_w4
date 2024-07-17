package com.statement.loop;

public class WhileExample2 {
	public static void main(String[] args) {
		int i = 1, sum = 0;
		
		while (i <= 100) {
			sum += i++; 
			// i = 1 // sum = sum + 1 -> i = 2
			// i = 2 // sum = sum + 2 -> i = 3
			// i = 3 // sum = sum + 3 -> i = 4
			// ...
			// i = 99 // sum = sum + 99 -> i = 100
			// i = 100 // sum = sum + 100 -> i = 101
			// i = 101 -> end
		}
		
		System.out.println("1부터 " + (i - 1) + "의 합계는 : " + sum);
		
	}
}
