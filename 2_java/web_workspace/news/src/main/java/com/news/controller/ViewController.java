package com.news.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.news.model.News;
import com.news.service.NewsService;
import com.news.service.NewsServiceImpl;

// 기사 보기
public class ViewController implements NewsController {
	
	NewsService ns = new NewsServiceImpl();
	

	@Override
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		try {
			String action = req.getParameter("action");
			// 기사 수정
			if (action != null && action.equals("modifyNews")) {
				ns.modifyNews(req);
				// 수정 내용이 즉시 반영되고, 해당 기사 id에 해당하는 글로 다시 이동
				res.sendRedirect("/news/newsView?id=" + req.getParameter("id"));
				return;
				
			} else {
			News news = ns.getNews(req);
			// 뉴스 가져와서 화면에 보여주기
			req.setAttribute("news", news);
			}
			
		} catch (Exception e) {
			// 오류시 newsList로 보냄
			res.sendRedirect("/news/newsList");
			return;
		}
		String view = "/WEB-INF/views/NewsView.jsp";
		req.getRequestDispatcher(view).forward(req, res);
		
	}

}
