package com.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String parameter = request.getParameter("name");
		HttpSession session = request.getSession();
//		request.setAttribute("loginUser", new User(parameter));
		session.setAttribute("loginUser", new User(parameter));
		
		// 로그인시 jps 홈메뉴로 이동
		response.sendRedirect("/jstl/jsp");
	}

}
