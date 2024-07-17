package com.oop.practice;

public class MemberService {

	// 로그인
	public boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}
	
	// 로그아웃
	public void logout(String id) {
		System.out.println(id + "님 로그아웃되었습니다.");
	}
	
	
	
}
