package com.response;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/res")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// http://localhost:8080/response_web/res
		// response.sendRedirect("https://www.naver.com"); // res 입력시 이동됨
		
//		response.setContentType("text/html"); // 한글은 사용 불가
//		PrintWriter out = response.getWriter();
//		out.println("<html><body><h1> HELLO WORLD~ <h1/></body></html>");
		
//		response.setContentType("application/json"); // 한글은 사용 불가
//		PrintWriter out = response.getWriter();
//		out.println("{ \"name\" : [\"BYE\" , \"HELLO\"] }");
		

//		System.out.println();
//		
//		String encodeURL =  response.encodeURL("http://localhost:8080/response_web/res?name=유현준");
//		System.out.println(encodeURL);
		
		
		
		// 쿠키
		Cookie myCookie = new Cookie("data", "야미~");
		myCookie.setMaxAge(3);
		response.addCookie(myCookie);
		response.setContentType("text/html;charset=UTF-8");
		
		response.addHeader("header", "headerValue"); // 개발자도구 Headers에서는 대소문자 구분X
		
		Collection<String> headerNames = response.getHeaderNames();
		for (String h : headerNames) {
			System.out.println(h);
		}
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1> HELLO COOKIE~ <h1/></body></html>");
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
