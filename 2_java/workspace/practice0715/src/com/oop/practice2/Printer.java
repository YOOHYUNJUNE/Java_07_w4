package com.oop.practice2;

public class Printer {
	private static final String MSG = "출력 : ";
	public static void println(int value) {
		System.out.println(MSG + value);
	}
	public static void println(boolean value) {
		System.out.println(MSG + value);
	}
	public static void println(double value) {
		System.out.println(MSG + value);
	}
	public static void println(String value) {
		System.out.println(MSG + value);
	}

}