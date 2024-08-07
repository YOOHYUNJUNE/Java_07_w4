package com.news.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import com.news.dao.NewsDAO;
import com.news.dao.NewsDAOImpl;
import com.news.model.News;

public class NewsServiceImpl implements NewsService {
	NewsDAO newsDAO = new NewsDAOImpl();

	@Override
	// 요청 파라미터(title, img, content)를 가지고 News 객체 생성
	public void addNews(HttpServletRequest req) throws Exception {
		
		String title = req.getParameter("title");
		String content = req.getParameter("content");

		// img 가져오기
		Part part = req.getPart("img");
		String header = part.getHeader("content-disposition");
		int start = header.indexOf("filename=");
		String img = header.substring(start + 10, header.length()-1);
		
		// img 저장
		if (img != null && !img.isEmpty()) {
			part.write(img);
		}
		
		// News 객체 생성 (title, img, content만으로 된 public news 생성)
		News news = new News(title, img, content);
		
		// DAO에게 DB에 넣으라 명령
		newsDAO.addNews(news);
		
		
		
	}

	@Override
	public List<News> getAll() throws Exception {
		return newsDAO.getAll();
	}

	@Override
	// 뉴스 클릭 메소드
	public News getNews(HttpServletRequest req) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		return newsDAO.getNews(id);
	}

	@Override
	public void deleteNews(HttpServletRequest req) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		newsDAO.deleteNews(id);
		
	}

	@Override
	public void modifyNews(HttpServletRequest req) throws Exception {
		// id값 가져오기 (수정)
				int id = Integer.parseInt(req.getParameter("id"));
				News news = newsDAO.getNews(id);
				
				String title = req.getParameter("title");
				String content = req.getParameter("content");
				
				// 기사 수정
				news.setTitle(title);
				news.setContent(content);
				
				// img 가져오기
				Part part = req.getPart("img");
				String header = part.getHeader("content-disposition");
				int start = header.indexOf("filename=");
				String img = header.substring(start + 10, header.length()-1);
				
				// img 저장
				if (img != null && !img.isEmpty()) {
					part.write(img);
					// 수정시
					news.setImg(img);
				}
				
				// DAO에게 DB에 넣으라 명령
				newsDAO.modifyNews(news);
		
	}
	
	
	
	
	

}
