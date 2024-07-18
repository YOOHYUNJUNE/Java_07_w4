package com.exception;

public class ExceptionExample2 {
	public static void main(String[] args) {
		
		String className1 = "java.lang.String";
		try {
			Class.forName(className1);
			System.out.println(className1 + "이 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		String className2 = "java.lang.String2";
		try {
			Class.forName(className2);
			System.out.println(className2 + "이 존재합니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
