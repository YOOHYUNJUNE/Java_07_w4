package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBConnextion1 {

	public static void main(String[] args) {
		
		// 로그인, 회원 추가, 게시글 추가, 게시글 수정, 게시글 삭제
		
		// 1. sql 명령문 (select, update, insert, delete 등)
		// 2. conn.prepareStatement
		// 3. Scanner 입력문
		// 4. Stmt.setString(?위치, 내용)
		// 5. rs = executeQuery : 조회 / executeUpdate : 추가,수정,삭제
		// 6. rs.close();
		
		try {
			// JDBC driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB연결
			String url = "jdbc:mysql://localhost:3306/kostagram";
			String user = "root";
			String password = "1234";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결되었습니다.");
			
			Scanner sc = new Scanner(System.in);
		
			///////////////////////////////////////////////////////////////////
			
			// 1. 로그인 / email, password 일치 / getString("name")
			String login = "select * from users where email=? and password=?";
			PreparedStatement loginStmt = conn.prepareStatement(login);
			
			// 이메일 입력
			System.out.println("이메일을 입력하세요.");
			String user_email = sc.nextLine();
			// 비밀번호 입력
			System.out.println("비밀번호를 입력하세요.");
			String user_pw = sc.nextLine();
			
			loginStmt.setString(1, user_email);
			loginStmt.setString(2, user_pw);
			
			// 실행하고 결과를 가져옴
			ResultSet rs = loginStmt.executeQuery();
			
			// 일치 여부
			if (rs.next()) {
				System.out.println("로그인되었습니다.");
				// 일치시 컬럼명의 내용을 가져옴
				System.out.print("반갑습니다. ");
				System.out.print(rs.getString("name"));
				System.out.print("님");
			} else {
				System.out.println("바르게 입력하세요.");
			}

			rs.close();
			
			
//			// 2. 회원 추가 / insert into users (name, email, password)
//			String addUser = "insert into users (name, email, password) values (?,?,?)";
//			PreparedStatement addUserStmt = conn.prepareStatement(addUser);
//			
//			// 회원 이름, 이메일, 비밀번호 입력
//			System.out.println("이름을 입력하세요.");
//			String addName = sc.nextLine();
//			System.out.println("이메일을 입력하세요.");
//			String addEmail = sc.nextLine();
//			System.out.println("비밀번호를 입력하세요.");
//			String addPassword = sc.nextLine();
//			
//			addUserStmt.setString(1, addName);
//			addUserStmt.setString(2, addEmail);
//			addUserStmt.setString(3, addPassword);
//			
//			int rs = addUserStmt.executeUpdate();
//			System.out.println(rs + "명의 회원이 추가되었습니다.");
//			
//			
//			// 3. 게시글 추가 / insert into posts (user_id, content)
//			String addPost = "insert into posts (user_id, content, image) values (?,?,?)";
//			PreparedStatement addPostStmt = conn.prepareStatement(addPost);
//			
//			// 작성하는 유저id, 게시글 입력
//			System.out.println("작성할 유저의 ID를 입력하세요.");
//			int user_id = sc.nextInt();
//			System.out.println("게시글 내용을 입력하세요.");
//			sc.nextLine();
//			String content = sc.nextLine();
//			System.out.println("이미지를 등록하세요.");
//			String img = sc.nextLine();
//			
//			addPostStmt.setInt(1, user_id);
//			addPostStmt.setString(2, content);
//			addPostStmt.setString(3, img);
//			
//			int rs = addPostStmt.executeUpdate();
//			System.out.println(rs + "개의 게시글이 등록되었습니다.");
//			
//			
//			
//			// 4. 게시글 수정 / update posts set content = ? where id = ?
//			String editPost = "update posts set content=? where id=?";
//			PreparedStatement editPostStmt = conn.prepareStatement(editPost);
//			
//			// 게시물 id, 게시글 내용
//			System.out.println("수정할 게시물의 ID를 입력하세요");
//			int post_id = sc.nextInt();
//			sc.nextLine();
//			System.out.println("수정할 내용을 입력하세요.");
//			String content = sc.nextLine();
//			
//			editPostStmt.setInt(2, post_id);
//			editPostStmt.setString(1, content);
//			
//			int rs = editPostStmt.executeUpdate();
//			System.out.println(rs + "개의 게시글이 수정되었습니다.");
//			
//		
//			// 5. 게시글 삭제 / delete from posts where id = ?
//			String deletePost = "delete from posts where id=?";
//			PreparedStatement deletePostStmt = conn.prepareStatement(deletePost);
//				
//			// 삭제할 게시물의 ID
//			System.out.println("삭제할 게시물의 ID를 입력하세요.");
//			int post_id = sc.nextInt();
//			
//			deletePostStmt.setInt(1, post_id);
//			
//			int rs = deletePostStmt.executeUpdate();
//			System.out.println(rs + "개의 게시글이 삭제되었습니다.");
//				
//			
//			// 6. 게시물 보기 / select content from posts
//			String readPost = "select * from posts";
//			PreparedStatement readPostStmt = conn.prepareStatement(readPost);
//			
//			System.out.println("게시물을 불러옵니다.");
//			ResultSet rs = readPostStmt.executeQuery();
//			
//			while (rs.next()) {
//				System.out.println(
//					rs.getInt("id") + "\t" +
//					rs.getInt("user_id") + "\t" +
//					rs.getString("content") + "\t" +
//					rs.getDate("updated_at")
//					
//				);
//				
//			}
//			rs.close();
			
			
			
			
			
			
			
			sc.close();
				
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC를 불러올 수 없습니다.");
				e.printStackTrace();
		} 
//		finally {
//			// 마지막에는 연결 연결 종료
//			try {
//				if (conn != null) 
//					conn.close();
//				} catch (SQLException e) {
//					System.out.println("conn 객체 종료 실패");
//					e.printStackTrace();
//				}
//			}
		
		
		
		
		
		
		
		
		
	}
}
