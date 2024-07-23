package com.lambda;

public class LambdaExample2 {
	public static void main(String[] args) {
		action(x -> System.out.println(x + "동작"));
		action((int x) -> System.out.println(x + "동작"));
		action((var x) -> System.out.println(x + "동작"));
		action(x -> {
			System.out.println(x + "동작");
			System.out.println(x + "동작");
			System.out.println(x + "동작");

			});

	}
	
	public static void action(MyInterface mi) {
//		int x = 3;
		mi.action(999);
	}
}
