package com.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.news.model.News;
import com.news.util.ConnectionPool.DBPool;

public class NewsDAOImpl implements NewsDAO {

	@Override
	public void addNews(News news) throws Exception {
		String sql = "insert into news (title, img, content) values (?,?,?)";
		try (				
			Connection conn = DBPool.getDBPool(); // static 메소드라 가져오기 가능
			PreparedStatement pstmt = conn.prepareStatement(sql);	
				
		) {
			pstmt.setString(1, news.getTitle());
			pstmt.setString(2, news.getImg());
			pstmt.setString(3, news.getContent());
			pstmt.executeUpdate();

		} 
		
	}

	@Override
	public List<News> getAll() throws Exception {
		String sql = "select * from news";
		List<News> newsList = new ArrayList<>();
		
		try (				
			Connection conn = DBPool.getDBPool(); // static 메소드라 가져오기 가능
			PreparedStatement pstmt = conn.prepareStatement(sql);	
			ResultSet rs = pstmt.executeQuery();
		) {
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String title = rs.getString("title");
				String img = rs.getString("img");
				String date = rs.getString("date");
				String content = rs.getString("content");
								
				News news = new News(id, title, img, date, content);
				newsList.add(news);
			}

		}
		return newsList;
	}
	
	

	@Override
	public News getNews(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNews(int id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
