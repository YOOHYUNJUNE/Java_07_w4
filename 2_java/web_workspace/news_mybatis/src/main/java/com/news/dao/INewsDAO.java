package com.news.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.news.config.SQLSessionFactory;
import com.news.model.NewsDTO;

public class INewsDAO implements NewsDAO {
	
	private SqlSessionFactory ssf = SQLSessionFactory.getssf();
	

	@Override
	public List<NewsDTO> getAllNewsList() throws Exception {
		// true : 자동 커밋 <-> false : 수동 커밋
		SqlSession sqlSession = ssf.openSession(true); // boolean값
//		sqlSession.commit(); // rollback()
		List<NewsDTO> newsList = sqlSession.selectList("selectNewsAll");
		sqlSession.close();
		return newsList;
	}

	
	// 뉴스 등록
	@Override
	public void insertNews(NewsDTO news) throws Exception {
		SqlSession sqlSession = ssf.openSession(true);
		sqlSession.insert("insertNews", news);
		sqlSession.close();
	}
	
	
	// 기사 보기
	@Override
	public NewsDTO getNewsById(int id) throws Exception {
		SqlSession sqlSession = ssf.openSession(true);
		NewsDTO newsDTO = sqlSession.selectOne("selectNews", id);
		sqlSession.close();
		return newsDTO;
	}
	

	@Override
	public void deleteNewsById(int id) throws Exception {
		SqlSession sqlSession = ssf.openSession(true);
		sqlSession.delete("deleteNews", id);
		sqlSession.close();

	}

	@Override
	public void updateNews(NewsDTO news) throws Exception {
		SqlSession sqlSession = ssf.openSession(true);
		sqlSession.update("updateNews", news);
		sqlSession.close();

	}

}
