package com.practice06;

public class ScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0; // 블록 바깥에서 선언 및 초기화하여 사용해야 한다.
		if (v1 > 10) {
			// int v2 = v1 - 10; // v2는 블록에서만 쓰인다.
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5;
		System.out.println(v3);
	}
}
