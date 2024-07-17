package com.coding_test;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        // 별 하나씩 찍기
        // 오른쪽 기준으로 정렬
        
        Scanner sc = new Scanner(System.in);
        // 별 개수를 입력하세요.
        System.out.println("별 개수를 입력하세요.");
//        int num = sc.nextInt();
        int num = 5;
        
        for (int i=1; i<=num; i++) {
        	
        	// num = 1 / i= 1 / j=0
        	// num = 3 / i= 1, 2, 3 / j= 2, 1, 0
        	// num = 5 / i= 1, 2, 3, 4, 5 / j= 4, 3, 2, 1, 0
        	
        	// 정렬
        	for (int j=num-i; j>0; j--) {
        		System.out.print(" ");
        	}
        	
        	for (int k=0; k<i; k++) {
        		System.out.print("*");
        	}
        	
        	// 별 출력
            System.out.println();
            
        }
      
        
        
        
    }
}












