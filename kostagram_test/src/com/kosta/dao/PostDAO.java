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

public class PostDAO {

	public int addPost(Post post) throws Exception {
		String sql = "INSERT INTO posts (user_id, content, image) VALUES (?, ?, ?)";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, post.getUser_id());
			psmt.setString(2, post.getContent());
			psmt.setString(3, post.getImage());
			int resultRow = psmt.executeUpdate();
			return resultRow;
		}
	}

	public List<Post> getPostList() throws Exception {
		String sql = "SELECT * FROM posts WHERE deleted_at IS NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
		) {
			List<Post> postList = new ArrayList<>();
			while (rs.next()) {
				Post post = new Post(
					rs.getInt("id"), rs.getInt("user_id"),
					rs.getString("content"), rs.getString("image"),
					rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")
				);
				postList.add(post);
			}
			return postList;
		}
	}

	public Post getPost(int id) throws Exception {
		String sql = "SELECT * FROM posts WHERE id = ? AND deleted_at IS NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();
			
			if (rs.next()) {
				return new Post(
					rs.getInt("id"),
					rs.getInt("user_id"),
					rs.getString("content"),
					rs.getString("image"),
					rs.getDate("created_at"),
					rs.getDate("updated_at"),
					rs.getDate("deleted_at")
				);
			}
		}
		return null;
	}

	public int updatePost(Post post) throws Exception {
		String sql = "UPDATE posts SET content = ?, image = ? WHERE id = ? AND deleted_at IS NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setString(1, post.getContent());
			psmt.setString(2, post.getImage());
			psmt.setInt(3, post.getId());
			return psmt.executeUpdate();
		}
	}

	public int deletePost(int id) throws Exception {
		String sql = "UPDATE posts SET deleted_at = now() WHERE id = ? AND deleted_at IS NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, id);
			return psmt.executeUpdate();
		}
	}

	public int addLike(int userId, int postId) throws Exception {
		String sql = "INSERT INTO likes (post_id, user_id) VALUES (?, ?) " +
				"ON DUPLICATE KEY UPDATE deleted_at = NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, postId);
			psmt.setInt(2, userId);
			return psmt.executeUpdate();
		}
	}

	public List<Post> getLikedPostListByUser(int userId) throws Exception  {
		String sql = "SELECT p.* FROM posts p "
				+ "JOIN likes l ON l.post_id = p.id "
				+ "WHERE l.user_id = ? AND l.deleted_at IS NULL AND p.deleted_at IS NULL";
		try (
			Connection conn = DBConnection.getConnection();
			PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, userId);
			ResultSet rs = psmt.executeQuery();
			
			List<Post> postList = new ArrayList<>();
			while (rs.next()) {
				Post post = new Post(
					rs.getInt("id"), rs.getInt("user_id"),
					rs.getString("content"), rs.getString("image"),
					rs.getDate("created_at"), rs.getDate("updated_at"), rs.getDate("deleted_at")
				);
				postList.add(post);
			}
			return postList;
		}
	}

	public int deleteLike(int userId, int postId) throws Exception  {
		String sql = "UPDATE likes SET deleted_at = now() " +
				"WHERE post_id =? AND user_id = ? AND deleted_at IS NULL";
		try (
				Connection conn = DBConnection.getConnection();
				PreparedStatement psmt = conn.prepareStatement(sql);
		) {
			psmt.setInt(1, postId);
			psmt.setInt(2, userId);
			return psmt.executeUpdate();
		} 
	}
}
