package com.kosta.service;

import java.sql.SQLException;

import com.kosta.model.User;

public interface UserService {
	
	
	// userMenu
	
	
	User getUser(int id);
	
//	void getUserList();

	void addUser() throws SQLException; // [1] 회원가입
	
//	void modifyUser();

	void delUser(); // [5] 회원 탈퇴
	
	void addFollow(); // [2] 팔로우
	
	void delFollow(); // [3] 언팔로우

	void getFollowList(); // [4] 팔로우 리스트
	
}
