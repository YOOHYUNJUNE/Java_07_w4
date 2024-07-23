package com.lambda2;

import java.util.Scanner;

public class Calculator {
	public void calculate(Calculable calc) { // 인터페이스 함수를 받아옴
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자를 입력하세요 -> ");
	int x = sc.nextInt();
	System.out.print("\n숫자를 입력하세요 -> ");
	int y = sc.nextInt();
	
	int result = calc.calculate(x, y);
	System.out.println(result);
	
//	sc.close();
	}
}
