package com.oop.singleton;

public class Singleton {
	private static Singleton st = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (st == null) {
			st = new Singleton();
		}
		return st;
	}
}
