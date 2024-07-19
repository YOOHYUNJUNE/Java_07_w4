package com.generic;

public class BoxExample {
	public static void main(String[] args) {
		
		// 오브젝트만 들어갈 수 있음
		Box box = new Box();
//		Object text = new String("안녕하세요");
//		Object text = "안녕하세요";
//		String content1 = (String) box.content;
		box.content = "안녕하세요";
		
//		Integer i = 10;
//		Object number = 10;
		box.content = 10;
		
		box.content = new Member("유현준", 30);
		
		
		
		
		
		
		
		
	}
}
