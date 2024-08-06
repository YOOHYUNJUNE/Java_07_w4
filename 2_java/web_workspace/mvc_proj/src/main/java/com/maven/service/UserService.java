package com.maven.service;

import java.util.List;

import com.maven.dao.UserDAO;
import com.maven.model.User;

public class UserService {
	
	// DAO가져오기 (DB유지)
	private UserDAO userDAO = new UserDAO();
	
	public void addUser(User user) {
		userDAO.addUser(user);
	}
	
	
	public List<User> getAlluserList() {
		return userDAO.getAlluserList();
	}
	
}
