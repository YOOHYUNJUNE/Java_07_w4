package com.kosta.controller;

import java.sql.Connection;
import java.util.Scanner;

import com.kosta.service.UserService;
import com.kosta.util.DBConnection;

public class KostagramExample {
	
	// 스캐너
	public static Scanner sc = new Scanner(System.in);
	
	// 무한 루프 메소드
	public static boolean isActive = true;
	
	// UserService 인스턴스
	public static UserService us = new UserService();
	
	public static void main(String[] args) {
		
		// 데이터베이스 연결 : util에서
		try ( // 리소스 자동 닫기 : try()
			Connection conn = DBConnection.getConnection();
				
		) {
//			System.out.println("연결 성공");
			
			// 메뉴 출력(무한 루프 : isActive)
			while (isActive) {
				System.out.println("\n--------------- KOSTAGRAM MENU ---------------");
				System.out.println("[1] 회원 가입 | [2] 회원 탈퇴 | [3] 회원 목록 | [4] 팔로우 | [5] 언팔로우 | [6] 종료");
				int num = sc.nextInt();
				sc.nextLine();
				
				switch (num) {
					case 1 : // 회원 가입
						us.signUpUser();
						break;
						
					case 2 : // 회원 탈퇴
						us.withdrawlUser();
						break;
						
					case 3 : // 회원 목록
						
						break;
						
					case 4 : // 팔로우
						
						break;
						
					case 5 : // 언팔로우
						
						break;
						
					case 6 : // 종료
						System.err.println("종료합니다.");
						isActive = false;
						
						
				}
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			if (sc != null) sc.close();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
