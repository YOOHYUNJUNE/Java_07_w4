package com.referencere.basic;

public class ReferenceExample {
	public static void main(String[] args) {
		String[] names = {"가가", "나나", "다다", null};
		
		for (int i=0; i<4; i++) {
			String name = names[i];
			System.out.println(name.charAt(0));
		}

		
	}
}
