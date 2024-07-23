package com.coding_test_4w;

import java.util.Scanner;

public class 분해합 {
	public static void main(String[] args) {
		
		// 자연수 N의 분해합 = N과 N을 이루는 수의 합
		// 생성자 : 분해합의 반대
		// 216의 생성자 : 198
		
		// n = 216 입력시,
		// abc + a + b + c = n
		
		// 어떤 수 m 입력시, 이 수와 각 자리 수 출력
		
		Scanner sc = new Scanner(System.in);
		
		// 분해합이 될 수 입력
		int n = sc.nextInt();
		int result = 0;
		
		// n까지 탐색
		
		for (int i=0; i<n; i++) {
			// 생성자
			int m = i;
			// 각 수의 합(분해합이 되는지 조회할 수)
			int sum = 0;
			
			// m의 
			while (m != 0) {
				sum = m + m%10; // sum에 의 1의 자리
				m /= 10; // m을 한자리 낮추고, 다음 반복에서 1의자리를 더하기 위함
			}
			
			if (n == m) {
				result = m;
				break;
			}
			
		}
		System.out.println(result);
		System.out.println(n);
		sc.close();
		
		
		
		
		
	}
}
