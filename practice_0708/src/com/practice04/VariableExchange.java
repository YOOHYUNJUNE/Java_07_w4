package com.practice04;

public class VariableExchange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		// 스왑
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);

	}

}
