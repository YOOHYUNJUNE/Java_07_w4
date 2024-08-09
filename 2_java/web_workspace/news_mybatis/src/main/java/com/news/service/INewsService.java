package com.news.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.news.dao.INewsDAO;
import com.news.dao.NewsDAO;
import com.news.model.NewsDTO;

public class INewsService implements NewsService {
	
	private NewsDAO newsDAO = new INewsDAO();

	
	@Override
	public List<NewsDTO> getAll() throws Exception {
		return newsDAO.getAllNewsList();
	}

	
	
	@Override
	public void addNews(HttpServletRequest req) throws Exception {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String img = saveImg(req, "img");
		
		NewsDTO newsDTO = new NewsDTO(0, title, img, null, content);
		newsDAO.insertNews(newsDTO);
	
	}
	

	// 이미지 저장 메소드 --------------------------------------------------------------
	
	private String saveImg(HttpServletRequest req, String name) throws IOException, ServletException {
	// img 가져오기 : Header > content-disposition > originImg (파일명) 가져오기
		Part part = req.getPart("img");
		String header = part.getHeader("content-disposition");
		int start = header.indexOf("filename=");
		String originImg = header.substring(start + 10, header.length()-1);
		
	// img 저장 : (originImg)파일명이 존재하는 경우 현재 날짜,시간으로 이름을 변경해 저장
		if (originImg != null && !originImg.isEmpty()) {
		// StringBuilder를 이용해서, 저장되는 이미지를 날짜,시간으로 바꾸기
			StringBuilder img = new StringBuilder();
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmSS");
			String time = dateFormat.format(cal.getTime());
			img.append(time).append(originImg.substring(originImg.lastIndexOf(".")));
			originImg = img.toString();
			part.write(originImg);
		// 파일명이 없는 경우
		} else { 
			originImg = null;
		}
		return originImg;	
	}
	//-----------------------------------------------------------------------------
	
	
	

	@Override
	public NewsDTO getNews(HttpServletRequest req) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		return newsDAO.getNewsById(id);

	}

	@Override
	public void removeNews(HttpServletRequest req) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		newsDAO.deleteNewsById(id);

	}

	@Override
	public void editNews(HttpServletRequest req) throws Exception {
		int id = Integer.parseInt(req.getParameter("id"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String img = saveImg(req, "img");
		
		NewsDTO news = newsDAO.getNewsById(id);
		news.setTitle(title);
		news.setContent(content);
		
		if(img != null) {
			news.setImg(img);
		} 
		
		newsDAO.updateNews(news);

	}

}
