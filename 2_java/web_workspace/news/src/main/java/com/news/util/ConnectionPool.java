package com.news.util;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class ConnectionPool {

	// connection pool : DB와의 연결을 관리하는 도구
	// 여러개의 연결을 미리 만들어놓고 필요할 때마다 제공
	public static class DBPool {
		private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		private static final String DB_URL = "jdbc:mysql://localhost:3306/news_db";
		private static final String DB_USER = "root";
		private static final String DB_PASSWORD = "1234";
		
		// 아파치 DBCP(DataBase Connection Pooling) 라이브러리 사용
		static final BasicDataSource dbcp = new BasicDataSource();
		static {
			dbcp.setDriverClassName(JDBC_DRIVER);
			dbcp.setUrl(DB_URL);
			dbcp.setUsername(DB_USER);
			dbcp.setPassword(DB_PASSWORD);
			
			// 연결 수 관리
			dbcp.setInitialSize(10); // 초기 연결 수
			dbcp.setMaxTotal(50); // 최대 연결 수 50개
			dbcp.setMaxIdle(20); // 최대 유휴 20개
			dbcp.setMinIdle(5); // 최소 유휴
		}
		
		public static Connection getDBPool() throws SQLException {
			return dbcp.getConnection();
		}
		
	}
	
	
}
