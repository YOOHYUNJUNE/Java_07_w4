package com.reference.list;

public class ListPractice {

	public static void main(String[] args) {
		String[] season = { "봄", "여름", "가을", "겨울" };
		
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
		
		season[0] = "Spring";
		season[1] = "Summer";
		season[2] = "Autumn";
		season[3] = "Winter";
		
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
		System.out.println("season[3] : " + season[3]);
	}

}
