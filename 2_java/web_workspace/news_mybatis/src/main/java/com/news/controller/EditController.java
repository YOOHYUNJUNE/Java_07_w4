package com.news.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.model.NewsDTO;
import com.news.service.INewsService;
import com.news.service.NewsService;

public class EditController implements NewsController {
	
	private NewsService ns = new INewsService();

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String viewPath = "/WEB-INF/views/add.jsp";
		
		try {
			// POST 방식일 때는 작성한 입력값들을 가져와서 DB 수정 후, 개별 기사로 이동
			if (req.getMethod().equals("POST")) {
				ns.editNews(req);
				viewPath = "/WEB-INF/views/detail.jsp";
			}
			// POST 방식이 아닐 때는 기사 수정 화면 
			NewsDTO news = ns.getNews(req);
			req.setAttribute("news", news);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e.getMessage());
		}
		req.getRequestDispatcher(viewPath).forward(req, res);
	}

}
