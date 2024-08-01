package com.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
					rs.getInt("id"), rs.getString("name"),
					rs.getString("email"), rs.getString("password"),
					rs.getString("bio"), rs.getString("profile_pic"),
					rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")			
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

	// 유저 목록
	public List<User> getUserList() throws Exception {
		String sql = "select * from users where deleted_at is null"; // DEL_CHK;
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {			
			List<User> userList = new ArrayList<>();
			
			while (rs.next()) {
				User user = new User (
					rs.getInt("id"), rs.getString("name"),
					rs.getString("email"), rs.getString("password"),
					rs.getString("bio"), rs.getString("profile_pic"),
					rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")				
				);				
				userList.add(user);
			}
			return userList;
		}
	}

	// 팔로우
	public int addFollower(int user_id, int target_id) throws Exception {
		String sql = "insert into followers (following_id, followed_id) values (?,?) "
				+ "on duplicate key update deleted_at = null"; // 비교가 아니라 대입이므로 is가 아니라 = null
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {	
			pstmt.setInt(1, user_id);
			pstmt.setInt(2, target_id);
			return pstmt.executeUpdate(); // public void -> int 변경
		}
	}

	
	// 팔로우 하기
	public List<User> getFollowers(int id) throws Exception {
		// id를 팔로우하는 사용자 리스트
		String sql = "select * from followers f " +
					"join users ing on ing.id = f.following_id " +
					"join users ed on ed.id = f.followed_id " + 
					"where ing.id=? and f.deleted_at is null";
		// ing -> ed
		// 침착맨 5 -> 심영 15 (탈퇴하지 않은 경우만)
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {			
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			List<User> userList = new ArrayList<>();
			
			while (rs.next()) {
				User user = new User (
					rs.getInt("id"), rs.getString("name"),
					rs.getString("email"), rs.getString("password"),
					rs.getString("bio"), rs.getString("profile_pic"),
					rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")				
				);				
				userList.add(user);
			}
			return userList;
		}
	}

	
	// 언팔로우
	public int deleteFollower(int user_id, int target_id) throws Exception {
		String sql = "update followers set deleted_at = now() where following_id =? and followed_id=?" + DEL_CHK;
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {	
			pstmt.setInt(1, user_id);
			pstmt.setInt(2, target_id);
			return pstmt.executeUpdate(); // public void -> int 변경
		}
	}


		
	
	
	
	
	
	
	
	
}
