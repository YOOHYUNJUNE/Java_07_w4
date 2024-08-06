package w6;

import java.util.Scanner;

public class 콜라문제 {
	public static void main(String[] args) {
		
		// a개의 빈병을 주면 콜라 b병을 받을때, n개의 빈병을 주면 콜라 몇 병을 받는가
		// a=2, b=1, n=20 -> 19		
		// a=3, b=1, n=20 -> 9		
		// 1. 20 -> a*6반납 : b*6 + 2 남음 (6받음) 누적 6
		// 2. 8  -> a*2반납 : b*2 + 2 남음 (2받음) 누적 8
		// 3. 4  -> a*1반납 : b*1 + 1 남음 (1받음) 누적 9
		
		// a=3, b=2, n=20			n//a=6 6//a=2
		// 1. 20 -> a*6반납 : b*6 + 2 남음 (12받음) 누적 12
		// 2. 14 -> a*4반납 : b*4 + 2 남음 (8받음)	누적 20
		// 3. 10 -> a*3반납 : b*3 + 1 남음 (6받음)  누적 26
		// 4. 7  -> a*2반납 : b*2 + 1 남음 (4받음)  누적 30
		// 5. 5  -> a*1반납 : b*1 + 2 남음 (2받음)  누적 32
		// 6. 4  -> a*1반납 : b*1 + 1 남음 (2받음)  누적 34
		// 7. 3  -> a*1반납 : b*1 + 0 남음 (2받음)  누적 36
		// n//a*b
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("a : ");
		int a = sc.nextInt(); // 최소 제출할 빈 병 / a=3
//		System.out.println("b : ");
		int b = sc.nextInt(); // 받을 콜라 / b=2
//		System.out.println("n : ");
		int n = sc.nextInt(); // 갱신된 제출할 빈 병 / n=20
		
		int get = 0; // 이번에 받을 콜라
		int result = 0; // 누적 받을 콜라 / result=36
		
		while (n>=a) {
			get = n / a * b;
			result += get;
			n = n % a + get; // n 갱신
			
//			System.out.println("a : " + a);
//			System.out.println("n : " + n);
//			System.out.println("result : " + result);
//			System.out.println("get : " + get);
			
		}
		
		System.out.println(result);
		
		
		
	}
}
