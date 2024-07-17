package com.coding_test_3w;

// 프로그래머스


import java.util.Arrays;

public class BallThrow {
	public static void main(String[] args) {
		
        int answer = 0;
        int index = 0;
		int result = 0;
		int k =10;
		
		int[] numbers = new int[9];
		// 배열 생성
		for (int i=1; i<k; i++) {
			
			// 공 던지기
			// i = 3 / 1, 3, 2, 1, 3...
			// i = 4 / 1, 3, 1, 3, 1, 3...
			// i = 5 / 1, 3, 5, 2, 4, 1...
			// i = 6 / 1, 3, 5, 1, 3, 5...
			// i = 7 / 1, 3, 5, 7, 2, 4....
			index += 2;
		
		}
        index = index % numbers.length;
        
        
//        return numbers[index];
    }
    
}