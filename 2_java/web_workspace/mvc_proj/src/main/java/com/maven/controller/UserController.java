package com.maven.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.maven.model.User;
import com.maven.service.UserService;


@WebServlet("/user") // http://localhost:8080/user/
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService us = new UserService();
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// get 방식을 통한 접근
		// action 값이 list 또는 없으면 userList를 보여줌
		// action 값이 new면 userForm을 보여줌
		String action = req.getParameter("action");
		
		if (action == null) {
			action = "list";
		}
		
		switch (action) {
			case "new" : // uesrForm
				// http://localhost:8080/user?action=new
				req.getRequestDispatcher("/WEB-INF/views/userForm.jsp").forward(req, res);
				break;
			case "list" : // userList
			default :
				// http://localhost:8080/user?action=list
				req.setAttribute("userList", us.getAlluserList()); // userList 가져오기
				req.getRequestDispatcher("/WEB-INF/views/userList.jsp").forward(req, res);
				break;
		}
		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// post 방식을 통한 접근 (http://localhost:8080/user)
		// name과 email을 받아 user 인스턴스를 생성하고 추가
		// userList를 보여줌
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		// 유저 인스턴스
		User u = new User(name, email);
		
		// userList에 u 추가
		us.addUser(u);
		
		// userList 보여주기
		res.sendRedirect("user?action=list");
		
		
	}

}
