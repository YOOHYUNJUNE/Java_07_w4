package com.math;

public class MathExample {
	public static void main(String[] args) {
		
		// Math 클래스: 정적 메소드 (인스턴스 생성 불가)
		
		int a = -10;
		double b = -Math.PI;
		System.out.println("a 절대값 : " + Math.abs(a));
		System.out.println("b 절대값 : " + Math.abs(b));
		
		double c = 7.8;
		double d = -8.4;
		System.out.println("c 올림 : " + Math.ceil(c));
		System.out.println("d 올림 : " + Math.ceil(d));
		
		System.out.println("c 버림 : " + Math.floor(c));
		System.out.println("d 버림 : " + Math.floor(d));

		System.out.println("c 반올림 : " + Math.round(c));
		System.out.println("d 반올림 : " + Math.round(d));

		
		double e = 16.0;
		int f = 2;
		int g = 3;
		System.out.println("e 제곱근 : " + Math.sqrt(e));
		System.out.println("f^g : " + Math.pow(f, g));

		
		int h = 10;
		int i = 20;
		System.out.println("최대값 : " + Math.max(h, i));
		System.out.println("최소값 : " + Math.min(h, i));
		
		System.out.println("0이상 ~ 1미만 랜덤 : " + Math.random());
		System.out.println(Math.random());

		
	}
}
