package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample5 {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스를 찾을 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("입력값이 Null 입니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류");
		}
		
		
	}
	
	// throws하여, try - catch 된 것과 같음
	public static void findClass() throws Exception {
//		Class.forName("java.lang.String2");
//		String className = "jjava.lang.String";
		String className = null;
		Class.forName(className.substring(1));
		
	}
	
	
	
	
	
}
