package com.oop.basic.ch06;

public class Calculator {
	boolean power;
	
	void powerOff() {
		System.out.println("전원을 끕니당~");
		this.power = false;
	}
	
	void powerOn() {
		System.out.println("전원을 켭니당~");
		this.power = true;
	}
	
	int plus(int x, int y) {
		return power ? x + y : null;
	}
	
	int minus(int x, int y) {
		return power ? x - y : null;
	}
	
	int muliple(int x, int y) {
		return power ? x * y : null;
	}
	
	double divide(int x, int y) {
		return power ? (double) x / y : null;
	}

	// 덧셈
	// 가변 길이 매개변수: 배열
	int sum(int ...values) {
		int result = 0;
		if (power) {
			for (int i : values) {
				result += i;
			}
		}
		return result;
	}
	
	
	double sum(double ...values) {
		double result = 0;
		if (power) {
			for (double i : values) {
				result += i;
			}
		}
		return Math.round(result * 1000) / 1000.0;
	}
	
	
	
	
	
	
}
