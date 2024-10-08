package com.collection.map;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		
		// Properties 생성
		Properties properties = new Properties();
		
		// 현재 클래스와 동일 경로에 있는 database.properties 파일 로드
		try {
			properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));
			String driver = properties.getProperty("dirver");
			String url = properties.getProperty("url");
			String user = properties.getProperty("uesr");
			String password = properties.getProperty("password");
			
			System.out.println(driver + ", " + url + ", " + user + ", " + password);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
