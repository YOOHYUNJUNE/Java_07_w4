package com.lambda;

public class LambdaExample {
	public static void main(String[] args) {
		
		MyInterface mi = new MyInterface() {
			@Override
			public void action(int x) {
				System.out.println("숫자 " + x + "를 활용한 동작");
			}
		};
		mi.action(3);
		
		// 람다식
		MyInterface li = (x) -> System.out.println("숫자 " + x + "를 활용한 동작");
		li.action(4);
		
		
	}
}
