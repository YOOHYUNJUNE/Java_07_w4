package com.reference.list;

public class ListBasic3 {

	public static void main(String[] args) {
		String[] season;
		// 선언 시점과 대입 시점이 다른 경우에는 new 타입[]를 앞에 붙일 것!!!
		season = new String[] {"봄", "여름", "가을", "겨울" };
		
		// 배열의 길이가 변경된 것이 아니라, 다른 배열을 연결해주어서 변경된 것처럼 보이는 것뿐!
		// 배열의 길이는 변경할 수 없다는 사실은 영원하다!!!!
		season = new String[] {"Spring", "Summer", "Autumn" };
		
		System.out.println("season[0] : " + season[0]);
		System.out.println("season[1] : " + season[1]);
		System.out.println("season[2] : " + season[2]);
	}

}
