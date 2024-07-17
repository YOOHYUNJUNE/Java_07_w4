package com.practice04;

public class VariableExchange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y); // x: 3, y: 5
		
		// x와 y값을 교환하기
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y); // x: 5, y: 3
	}

}
