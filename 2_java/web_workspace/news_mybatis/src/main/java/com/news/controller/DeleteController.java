package com.news.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.model.NewsDTO;
import com.news.service.INewsService;
import com.news.service.NewsService;

public class DeleteController implements NewsController {
	
	private NewsService ns = new INewsService();

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			// POST방식일 때만 삭제 가능하게
			if (req.getMethod().equals("POST")) {
			ns.removeNews(req);
			// 삭제 후 리스트 보여주기
			res.sendRedirect("/news");
			return;
			} else {
				List<NewsDTO> newsList = ns.getAll();
				req.setAttribute("newsList", newsList);
				throw new Exception("잘못된 경로입니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String viewPath = "/WEB-INF/views/list.jsp";
		req.getRequestDispatcher(viewPath).forward(req, res);
		
	}

}
