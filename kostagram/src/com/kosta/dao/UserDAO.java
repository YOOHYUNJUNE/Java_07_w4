package com.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kosta.model.User;
import com.kosta.util.DBConnection;

// DAO : Data Access Object (데이터에 접근)
public class UserDAO {
	
	// and deleted_at is null 자주 사용하니까 상수로 만들기
	private static final String DEL_CHK = " and deleted_at is null";
	
	// 유저 추가
	public int addUser (User user) throws Exception {
		String sql = "insert into users (name, email, password, bio, profile_pic) values (?,?,?,?,?)";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getBio());
			pstmt.setString(5, user.getProfile_pic());
			
			int resultRow = pstmt.executeUpdate();
			return resultRow;
		}
		
		
	}

	// 유저 정보
	public User getUser(int id) throws Exception {
		String sql = "select * from users where id=?" + DEL_CHK;
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return new User (
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("email"),
					rs.getString("password"),
					rs.getString("bio"),
					rs.getString("profile_pic"),
					rs.getDate("created_at"),
					rs.getDate("updated_at"),
					rs.getDate("deleted_at")				
				);
				
			}
		}
		return null;
	}

	
	// 유저 삭제
	public int deleteUser(int user_id) throws Exception {
		String sql = "update users set deleted_at = now() where id=?" + DEL_CHK;
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, user_id);
			return pstmt.executeUpdate();
		}
	}
		
	
	
	
	
	
	
	
	
	
}
