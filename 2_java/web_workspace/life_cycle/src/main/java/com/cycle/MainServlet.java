package com.cycle;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainServlet") // http://localhost:8080/life_cycle/MainServlet
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("1. 초기화");
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("2. Get 메소드");
		
	}

	@Override
	public void destroy() {
		System.out.println("3. 종료");
		
	}

	
	
	


}
