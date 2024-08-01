package com.kosta.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kosta.model.Post;
import com.kosta.model.User;
import com.kosta.util.DBConnection;

// DAO : Data Access Object (데이터에 접근)
public class PostDAO {
	
	
	// 게시글 정보
	public Post getPost(int id) throws Exception {
		String sql = "select * from posts where id=? and deleted_at is null";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return new Post (
					rs.getInt("id"), rs.getInt("user_id"),
					rs.getString("content"), rs.getString("image"),
					rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")			
				);
				
			}
		}
		return null;
	}

	
	

	
	// [1] 게시글 추가
	public int addPost(Post post) throws Exception {
		String sql = "insert into posts (user_id, content, image) values (?,?,?)";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, post.getUser_id());
			pstmt.setString(2, post.getContent());
			pstmt.setString(3, post.getImage());
			
			int resultRow = pstmt.executeUpdate();
			return resultRow;
		}
	}
	
	
	// [4] 게시물 전체 보기
	public List<Post> getPostList() throws SQLException, Exception {
		String sql = "select * from posts where deleted_at is null";
		
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {			
			List<Post> postList = new ArrayList<>();
			
			while (rs.next()) {
				Post post = new Post (
					rs.getInt("id"), rs.getInt("user_id"),
					rs.getString("content"), rs.getString("image"),
					rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")				
				);				
				postList.add(post);
			}
			return postList;
		}
		
	}
	
	
	
	// [2] 게시물 수정
	public int updatePost(Post post) throws Exception {
		String sql = "update posts set content=?, image=? where id=? and deleted_at is null";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setString(1, post.getContent());
			pstmt.setString(2, post.getImage());
			pstmt.setInt(3, post.getId());
			return pstmt.executeUpdate();
		}
		
	}
	
	
	// [3] 게시물 삭제
	public int deletePost(int id) throws Exception {
		String sql = "update posts set deleted_at = now() where id=? and deleted_at is null"; 
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
		}
	}






	
	
	
	
	
	
	
	
	
	
	
}
