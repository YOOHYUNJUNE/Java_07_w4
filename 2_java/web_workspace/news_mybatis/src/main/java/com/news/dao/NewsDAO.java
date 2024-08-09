package com.news.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.news.model.NewsDTO;

public interface NewsDAO {
	// 뉴스 기사 전체 보기
	List<NewsDTO> getAllNewsList() throws Exception;
	
	// 뉴스 기사 추가
	void insertNews(NewsDTO news) throws Exception;
	
	// 뉴스 기사 보기
	NewsDTO getNewsById(int id) throws Exception;
	
	// 뉴스 기사 삭제
	void deleteNewsById(int id) throws Exception;
	
	// 뉴스 시가 수정
	void updateNews(NewsDTO news) throws Exception;


}
