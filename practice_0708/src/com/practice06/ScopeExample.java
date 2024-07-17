package com.practice06;

public class ScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0; // 블록 바깥에서 선언 및 초기화 하여 사용
		if (v1 > 10) {
//			int v2 = v1 - 10; // { } 내 선언된 변수 v2가 적용되지 않음 
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; 
		System.out.println(v3);

	}

}
