package com.statement.loop;

public class ForExample2 {
	public static void main(String[] args) {
		// 변수 2개이상 : a=a, b=b 
		for(int num=1, tNum=1; num <= 5; tNum += ++num) {
			System.out.println("숫자" + num + ", 삼각수 : " +tNum);
		}
	}
}
