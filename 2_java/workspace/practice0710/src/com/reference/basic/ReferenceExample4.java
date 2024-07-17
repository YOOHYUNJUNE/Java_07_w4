package com.reference.basic;

public class ReferenceExample4 {
	public static void main(String[] args) {
		String name1 = "최인규";
		String name2 = "최인규";
		String name3 = new String("최인규");
		String name4 = new String("최인규");
		
		System.out.println(name1 == name2); // T
		System.out.println(name1 == name3); // F
		System.out.println(name1 == name4); // F
		System.out.println(name2 == name3); // F
		System.out.println(name2 == name4); // F
		System.out.println(name3 == name4); // F
		
		System.out.println(name1.equals(name2)); // T
		System.out.println(name1.equals(name3)); // T
		System.out.println(name1.equals(name4)); // T
		System.out.println(name2.equals(name3)); // T
		System.out.println(name2.equals(name4)); // T
		System.out.println(name3.equals(name4)); // T
		
	}
}
