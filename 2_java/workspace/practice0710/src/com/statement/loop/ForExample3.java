package com.statement.loop;

public class ForExample3 {

	public static void main(String[] args) {
//		for (int i = 2; i <= 9; i++) {
//			System.out.println(i == 2 ? i + "단" : "\n" + i + "단");
//			for (int j = 1; j <= 9; j++)
//				System.out.println(i + " x " + j + " = " + i * j);
//		}

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println("");
		}
	}

}
