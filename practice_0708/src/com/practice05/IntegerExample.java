package com.practice05;

public class IntegerExample {

	public static void main(String[] args) {
		int var1 = 10;
		long var2 = 20L;
		int var3 = 2_147_483_647;
		long var4 = 2147383648L;
		int var5 = 2147383648; // int 허용 범위를 넘어감

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3 + 1);
		System.out.println(var4);
		System.out.println(var5);

	}

}
