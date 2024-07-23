package com.lambda3;

public class PersonExample {
	public static void main(String[] args) {
		
		Person me = new Person("유현준", "프로그래머", "대한민국");
		
		me.action1((name, job) -> {
			System.out.println("안녕하세요. 제 이름은 " + name);
			System.out.println("제 직업은 " + job + "입니다.");
		});
		
		me.action2(content -> {
			if (me.getNation().equals("대한민국")) {
				System.out.println("반갑습니다.");
			} else {
				System.out.println("Hello World!");
			}
		});
		
		
		
	}
}
