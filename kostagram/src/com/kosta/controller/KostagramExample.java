package com.kosta.controller;

import java.sql.Connection;
import java.util.Scanner;

import com.kosta.service.PostService;
import com.kosta.service.UserService;
import com.kosta.util.DBConnection;

public class KostagramExample {
	
	// 스캐너
	public static Scanner sc = new Scanner(System.in);
	
	// 무한 루프 메소드
	public static boolean isActive = true;
	
	// UserService 인스턴스
	public static UserService us = new UserService();
	
	// PostService 인스턴스
	public static PostService ps = new PostService();
	
	
	
	
	public static void main(String[] args) {
		
		// 데이터베이스 연결 : util에서
		try ( // 리소스 자동 닫기 : try()
			Connection conn = DBConnection.getConnection();			
		) {
			while(isActive) {
//				userMenu();
				System.out.println("\n--------------- POST MENU ---------------");
				System.out.println("[1] 작성 | [2] 수정 | [3] 삭제 | [4] 전체 목록 | [5] 좋아요 | [6] 좋아요 취소 | [7] 종료");
				int num = sc.nextInt();
				sc.nextLine();
				
				switch (num) {
					case 1 : // 작성
						// PostService > writePost()
						// 사용자 아이디, 게시글 내용, 이미지 입력 / id로 유저 존재 확인
						// PostDAO > addPost(Post post);
						// DB에 추가
						ps.writePost();
						break;
						
					case 2 : // 수정
						// PostService > modifyPost()
						// 전체 목록 출력 후 특정 게시물의 ID 확인
						// 게시글 내용 또는 이미지 수정 / 둘중 하나 null 허용
						// PostDAO > updatePost(Post post);
						// DB에 반영
						ps.modifyPost();
						break;
						
					case 3 : // 삭제						
						// PostService > deletePost()
						// 전체 목록 출력 후 특정 게시물의 ID 확인하고 삭제
						// PostDAO의 deletePost(int id);
						// DB에서 삭제 (deleted_at = now())
						ps.deletePost();
						break;
						
					case 4 : // 전체 목록
						// PostService > printAllPosts()
						// 전체 목록 출력
						// PostDAO > getPostList()
						// 반환 타입 LIST<Post>
						ps.printAllPosts();
						break;
						
					case 5 : // 좋아요
						ps.likePost();
						break;
					
					case 6 : // 좋아요 취소
						ps.unlikePost();
						break;
					
//					case 7 : // 종료
//						System.err.println("종료합니다.");
//						isActive = false;
					default :
						System.err.println("종료합니다.");
						isActive = false;
					}
				}
			} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			if (sc != null) sc.close();			
		}
		
		
	} // main
	
	
	// 유저 메뉴
	private static void userMenu() throws Exception {
		// 메뉴 출력(무한 루프 : isActive)
					while (isActive) {
						System.out.println("\n--------------- USER MENU ---------------");
						System.out.println("[1] 가입 | [2] 탈퇴 | [3] 회원 목록 | [4] 팔로우 | [5] 언팔로우 | [6] 종료");
						int num = sc.nextInt();
						sc.nextLine();
						
						switch (num) {
							case 1 : // 회원 가입
								us.signUpUser();
								break;
								
							case 2 : // 회원 탈퇴
								us.withdrawalUser();
								break;
								
							case 3 : // 회원 목록 조회
								us.printAllUsers();
								break;
								
							case 4 : // 팔로우
								us.followUser();
								break;
								
							case 5 : // 언팔로우
								us.unfollowUser();
								break;
								
//							case 6 : // 종료
//								System.err.println("종료합니다.");
//								isActive = false;
							default :
								System.err.println("종료합니다.");
								isActive = false;
								
						}
	
	
					}
					
	} // userMenu
	
	
	
	
	
	
}
	
	

