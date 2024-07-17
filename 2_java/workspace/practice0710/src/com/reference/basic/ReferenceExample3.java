package com.reference.basic;

public class ReferenceExample3 {
	public static void main(String[] args) {
		String[] names = {"서영훈", "김태환", "한민혁", null};
		
		for(int i=0; i<4; i++) {
			String name = names[i];
			System.out.println(name.charAt(0));
		}
	}
}
