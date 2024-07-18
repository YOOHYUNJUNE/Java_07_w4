package com.exception;

public class ExceptionExample4 {
	public static void main(String[] args) {
		
		String[] strArr = { "a80", "b90", null, "cloo" };
		for (int i=0; i<=strArr.length; i++) {
			
			try {
				String str = strArr[i];
				int value = Integer.parseInt(str.substring(1)); // 문자열의 index 1번부터 반환
				System.out.println("strArr[" + i + "] : " + value);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 초과 : " + e.getMessage());
			} catch (NumberFormatException | NullPointerException e) {
				System.out.println("숫자로 변환할 수 없음 : " + e.getMessage());
			} catch (Exception e) {
				System.out.println("실행에 문제가 있습니다.");
			}
		}
	}
}
