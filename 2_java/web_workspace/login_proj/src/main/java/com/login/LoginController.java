package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 한글처리 ("UTF-8")
		request.setCharacterEncoding("UTF-8");
		
		String action = request.getParameter("action");
		if (action != null && action.equals("logout")) {
			request.getSession().invalidate(); // 세션초기화(로그아웃)
		} else {
			String userId = request.getParameter("userId");
			String userPw = request.getParameter("userPw");			
		
		// 로그인 로직
		// id = 'uhj' pw = 1234 일 경우 로그인
			if (userId.equals("1234") && userPw.equals("1234")) {
				request.getSession().setAttribute("loginedUser", userId);
			} else {
				request.setAttribute("error", "로그인 에러 발생");
			}
		}
		
		// 결과 전달
//		request.getRequestDispatcher("/login");
		doGet(request, response);
//		response.sendRedirect("/login");
		
	}

}
