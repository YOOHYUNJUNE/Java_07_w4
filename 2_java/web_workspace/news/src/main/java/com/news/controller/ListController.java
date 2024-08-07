package com.news.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.model.News;
import com.news.service.NewsService;
import com.news.service.NewsServiceImpl;

// 전체 기사
public class ListController implements NewsController {
	
	NewsService ns = new NewsServiceImpl();

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			String action = req.getParameter("action");
			
			if (action != null && action.equals("addNews")) {
				System.out.println("기사 추가");
				ns.addNews(req);
				// 기사 등록 후 반복(양식 제출 등)되지 않게 경로 newsList 이동
				res.sendRedirect(req.getRequestURI());
				return; // 아래 getRequestDispatcher 중복 실행 방지
				
			} else if (action != null && action.equals("deleteNews")) {
				System.out.println("기사 삭제");
				ns.deleteNews(req);
				// 삭제 후 newsList 보여주기
				res.sendRedirect(req.getRequestURI());
				return;
				
				
			} else {
				// default (null인 경우)
				System.out.println("기사 전체 보기");
				List<News> list = ns.getAll();
				req.setAttribute("newsList", list);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("error", e.getMessage());
		}
		
		String view = "/WEB-INF/views/NewsList.jsp";
		req.getRequestDispatcher(view).forward(req, res);
		
	}

}
