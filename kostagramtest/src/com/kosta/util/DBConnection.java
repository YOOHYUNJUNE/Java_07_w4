package com.kosta.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static final String DB = "kostagram";
	private static final String URL = "jdbc:mysql://localhost:3306/" + DB;
	private static final String USER = "root";
	private static final String PASSWORD = "1234";

	// 연결
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		return conn;
	}
	
	
	
	
	
	
	
}
