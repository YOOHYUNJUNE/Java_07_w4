package com.news.config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SQLSessionFactory {
	// DB의 SQL 명령 실행 메소드를 가진 객체 (SqlSessionFactory) // mybatis로부터 가져옴
	public static SqlSessionFactory ssf;
	
	static {
		// 설정 파일 경로
		String resource = "com/news/config/mybatis-config.xml";
		
		// 설정 파일을 읽어서 SqlSessionFactory 객체 생성 
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			ssf = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			System.err.println("SQL 설정 에러");
			e.printStackTrace();
		}
	}
	
	// 싱글톤 방식
	public static SqlSessionFactory getssf() {
		return ssf;
	}
	
	
	
}
