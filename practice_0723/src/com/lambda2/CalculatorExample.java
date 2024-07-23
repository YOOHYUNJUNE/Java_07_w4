package com.lambda2;


public class CalculatorExample {
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.calculate((x, y) -> x + y);
		c.calculate((x, y) -> x - y);
		c.calculate((x, y) -> x * y);

//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 -> ");
//		int x = sc.nextInt();
//		System.out.print("\n숫자를 입력하세요 -> ");
//		int y = sc.nextInt();
//
//		Calculable sum = (a, b) -> a + b;
//		System.out.println(sum.calculate(x, y));
//		
//		Calculable substract = (a, b) -> a - b;
//		System.out.println(substract.calculate(x, y));
//
//		Calculable multiply = (a, b) -> a * b;
//		System.out.println(multiply.calculate(x, y));
//		
//		sc.close();
		
	}
	
	
	
	
}
