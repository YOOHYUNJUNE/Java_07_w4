package com.news.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.service.INewsService;
import com.news.service.NewsService;

public class AddController implements NewsController {
	
	private NewsService ns = new INewsService();
	

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			// GET 방식일 때는 기사 작성 화면 보여주고
//			if (req.getMethod().equals("GET")) {
//				String viewPath = "/WEB-INF/views/add.jsp";
//				req.getRequestDispatcher(viewPath).forward(req, res);
//				return;
//			}
			// POST 방식일 때는 작성한 입력값들을 가져와서 DB 저장 후, 기사 목록으로 이동
			if (req.getMethod().equals("POST")) {
				ns.addNews(req);
				res.sendRedirect("/news");
				return;
			}
			
			// POST 방식이 아닐 때는 기사 작성 화면 
			
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e.getMessage());
		}
		// GET 방식일 때는 기사 작성 화면 보여주고
		String viewPath = "/WEB-INF/views/add.jsp";
		req.getRequestDispatcher(viewPath).forward(req, res);
	}

}
