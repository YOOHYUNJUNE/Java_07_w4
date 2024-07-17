package com.practice05;

public class IntegerExample {

	public static void main(String[] args) {
		int var1 = 10; // long [OK]
		long var2 = 20L;
		int var3 = 2_147_483_647; // long [OK]
		long var4 = 2147483648L; // int의 허용범위 초과
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}
