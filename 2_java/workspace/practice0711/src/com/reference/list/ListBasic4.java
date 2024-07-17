package com.reference.list;

public class ListBasic4 {

	public static void main(String[] args) {
		String[] menus = {"햄버거", "떡볶이", "불백", "김치찜"};
		printItems("점심메뉴", menus);
		
		menus = new String[] { "제육볶음", "순대국밥", "돈까스"};
		printItems("새로운 점심메뉴", menus);
		
		printItems("저녁메뉴", new String[] {"자장면","짬뽕","볶음밥"});
	}

	public static void printItems(String name, String[] strArr) {
		System.out.println(name + "을 출력합니다.");
		for(int i=0; i<strArr.length; i++) {
			System.out.println("\t" + strArr[i]);
		}
	}
}
