package com.kosta.controller;

import java.sql.Connection;
import java.util.Scanner;

import com.kosta.service.PostService;
import com.kosta.service.UserService;
import com.kosta.util.DBConnection;

public class KostagramExample {
	
	// 입출력 받는 Scanner
	public static Scanner sc = new Scanner(System.in);

	// 무한 루프 boolean 값
	public static boolean isActive = true;
	
	// UserService 인스턴스 생성
	public static UserService us = new UserService();
	// PostService 인스턴스 생성
	public static PostService ps = new PostService();
	
	public static void main(String[] args) {
		try (
			// 데이터베이스 연결
			Connection conn = DBConnection.getConnection()
		) {
			// 무한루프
			while(isActive) {
				System.out.println("1. 회원 관리 | 2. 게시물 관리 | 3. 종료");
				int num = sc.nextInt();
				sc.nextLine();
				switch (num) {
					case 1: 
						userMenu();
						break;
					case 2:
						postMenu();
						break;
					case 3:
					default :
						isActive = false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) sc.close();
		}	
	}
	
	private static void postMenu() throws Exception {
		System.out.println("\n------- POST MENU -------");
		System.out.println("1. 작성 | 2. 수정 | 3. 삭제 | 4. 전체 목록 | 5. 좋아요 | 6. 좋아요 취소 | 7. 종료");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
			case 1:
				ps.writePost();
				break;
			case 2:
				ps.modifyPost();
				break;
			case 3:
				ps.deletePost();
				break;
			case 4:
				ps.printAllPosts();
				break;
			case 5:
				ps.likePost();
				break;
			case 6:
				ps.unlikePost();
				break;
			case 7:
				// 종료
				isActive = false;
		}
	}
	private static void userMenu() throws Exception {
		// 메뉴 출력
		System.out.println("\n------- USER MENU -------");
		System.out.println("1. 가입 | 2. 탈퇴 | 3. 전체 목록 | 4. 팔로우 | 5. 언팔로우 | 6. 종료");
		int num = sc.nextInt();
		sc.nextLine();
		switch (num) {
			case 1:
				// 회원가입
				us.signUpUser();
				break;
			case 2: 
				// 회원탈퇴
				us.withdrawalUser();
				break;
			case 3: 
				// 회원 전체 목록
				us.printAllUsers();
				break;
			case 4: 
				// 팔로우
				us.followUser();
				break;
			case 5: 
				// 언팔로우
				us.unfollowUser();
				break;
			case 6:
				// 종료
				isActive = false;
		}
	}
}