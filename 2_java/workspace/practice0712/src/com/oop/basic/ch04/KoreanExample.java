package com.oop.basic.ch04;

public class KoreanExample {
	public static void main(String[] args) {
		Korean me = new Korean("최인규", "990101-1234567");
		System.out.println(me.nation + ", " + me.name + ", " + me.ssn);
		
		Korean u = new Korean("카리나", "020101-4434567");
		System.out.println(u.nation + ", " + u.name + ", " + u.ssn);
	}
}
