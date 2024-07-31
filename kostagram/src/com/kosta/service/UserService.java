package com.kosta.service;

public interface UserService {
	
	
	// userMenu
	
	
//	void getUser();
	
//	void getUserList();

	void addUser(); // [1] 회원가입
	
//	void modifyUser();

	void delUser(); // [5] 회원 탈퇴
	
	void addFollow(); // [2] 팔로우
	
	void delFollow(); // [3] 언팔로우

	void getFollowList(); // [4] 팔로우 리스트
	
}
