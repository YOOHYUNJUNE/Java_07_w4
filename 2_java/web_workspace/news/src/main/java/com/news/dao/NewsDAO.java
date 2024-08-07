package com.news.dao;

import java.util.List;

import com.news.model.News;


//DAO(Data Access Object)는 소프트웨어 패턴 중 하나로,
//데이터베이스와의 상호작용을 캡슐화하여 데이터 액세스를 추상화하는 역할을 합니다. 
//DAO 패턴을 사용하면 데이터베이스의 데이터에 접근하는 로직을 분리하여 
//코드의 유지 보수성과 재사용성을 높일 수 있습니다.

public interface NewsDAO {
	
	// 뉴스 추가
	void addNews(News news) throws Exception;
	
	// 뉴스 전체보기
	List<News> getAll() throws Exception;
	
	// 뉴스 보기
	News getNews(int id) throws Exception;
	
	// 뉴스 삭제
	void deleteNews(int id) throws Exception;

	// 뉴스 수정
	void modifyNews(News news) throws Exception;
	
}
