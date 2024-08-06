package com.maven.dao;

import java.util.ArrayList;
import java.util.List;

import com.maven.model.User;

public class UserDAO {
	// DB 임의로 생성
	private List<User> userDB = new ArrayList<>();
	
	public void addUser(User user) {
		userDB.add(user);
	}
	
	
	public List<User> getAlluserList() {
		return userDB;
	}
	
	
}
