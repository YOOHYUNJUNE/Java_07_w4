package com.news.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.news.model.News;

public interface NewsService {
	
	// 뉴스 추가
	void addNews(HttpServletRequest req) throws Exception; 
	
	// 뉴스 전체보기
	List<News> getAll() throws Exception;
	
	// 뉴스 보기
	News getNews(HttpServletRequest req) throws Exception;
	
	// 뉴스 삭제
	void deleteNews(HttpServletRequest req) throws Exception;
	
	

}
