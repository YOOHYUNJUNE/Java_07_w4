package com.kosta.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.kosta.service.UserServiceImpl;

public class KostagramExample {
	public static Scanner sc = new Scanner(System.in);
	public static Connection conn = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	public static boolean isActive = true;
	
	private static UserServiceImpl us = new UserServiceImpl();

	

	public static void main(String[] args) {
		// DB 접속
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/kostagram";
			String user = "root";
			String password = "1234";
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("DB 연결 성공");
		
			
		while(isActive) switchMenu(); // 작동하는 코드
		
		
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("DB 오류");
		} finally {
			try {
				if (sc != null) sc.close();
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (SQLException e) {
				System.err.println("객체 종료 실패");
			}
		} // try catch 마지막
		
		
	} // main 메소드 마지막

	
	public static int mainMenu() {
		System.out.println("[1] 회원 관리 | [2] 게시물 관리 | [3] 종료");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static int userMenu() {
		System.out.println("[1] 회원가입 | [2] 팔로우 | [3] 언팔로우 | [4] 팔로우 리스트 | [5] 회원 탈퇴");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static int postMenu() {
		System.out.println("[1] 전체 게시물 | [2] 게시물 등록");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static int postSubMenu() {
		System.out.println("[1] 게시물 좋아요 | [2] 게시물 좋아요 취소 | [3] 게시물 수정 | [4] 게시물 삭제");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static void switchMenu() {
		switch (mainMenu()) {
			case 1:
				switchUserMenu();
				break;
			case 2:
				switchPostMenu();
				break;
			default:
				exit();
		}
	}

	public static void switchUserMenu() {
		switch (userMenu()) {
			case 1:
				us.addUser();
				break;
			case 2:
				System.out.println("팔로우");
				break;
			case 3:
				System.out.println("팔로우 취소");
				break;
			case 4:
				System.out.println("팔로우 리스트");
				break;
			case 5:
				System.out.println("회원 탈퇴");
				break;
		}
	}

	public static void switchPostMenu() {
		switch (postMenu()) {
			case 1:
				System.out.println("전체 게시물");
				switchPostSubMenu();
				break;
			case 2:
				System.out.println("게시물 등록");
				break;
		}
	}

	public static void switchPostSubMenu() {
		switch (postSubMenu()) {
			case 1:
				System.out.println("게시물 좋아요");
				break;
			case 2:
				System.out.println("게시물 좋아요 취소");
				break;
			case 3:
				System.out.println("게시물 수정");
				break;
			case 4:
				System.out.println("게시물 삭제");
				break;
		}
	}

	public static void exit() {
		isActive = false;
	}
}