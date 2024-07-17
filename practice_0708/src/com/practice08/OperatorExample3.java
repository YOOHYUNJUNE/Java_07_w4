package com.practice08;

public class OperatorExample3 {
	public static void main(String[] args) {
		
		int x = 10, y =10, z;
		x++; 
		++x;
		System.out.println("x :" + x); // 12
		
		System.out.println("--------------------");
		
		y--;
		--y;
		System.out.println("y :" + y); //8
		
		System.out.println("--------------------");

		z = x++;
		System.out.println("x : " + x); // 13
		System.out.println("z : " + z); // 12
		
		System.out.println("--------------------");

		z = ++x;
		System.out.println("x : " + x);
		System.out.println("z : " + z);
		
		System.out.println("--------------------");

		z = ++x + y++;
		
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("z : " + z);

		
		
		
		
	}
}
