package com.kosta.service;

import java.sql.SQLException;

import com.kosta.controller.KostagramExample;

public class UserServiceImpl implements UserService {


	
	@Override
	public void addUser() throws SQLException {
		System.out.println("\n =========================== 회원가입 ==============================");
		String sql = "insert into users (name, email, password, bio, profile_pic) values (?,?,?,?,?)";
		
		// 스캐너 가져오기
		System.out.print("이름 입력 : ");
		String name = KostagramExample.sc.nextLine();
		
		System.out.print("이메일 입력 : ");
		String email = KostagramExample.sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String password = KostagramExample.sc.nextLine(); 
		
		System.out.print("소개글 입력 : ");
		String bio = KostagramExample.sc.nextLine();
		bio = bio.equals("") ? null : bio; // bio를 빈칸으로 했을 경우 null로 입력됨
		
		System.out.print("프로필 파일명 입력 : ");
		String profile_pic = KostagramExample.sc.nextLine(); 
		profile_pic = profile_pic.equals("") ? null : profile_pic; // profile_pic를 빈칸으로 했을 경우 null로 입력됨

		// 커넥션 객체 가져오기
		KostagramExample.pstmt = KostagramExample.conn.prepareStatement(sql);			
		KostagramExample.pstmt.setString(1, name);
		KostagramExample.pstmt.setString(2, email);
		KostagramExample.pstmt.setString(3, password);
		KostagramExample.pstmt.setString(4, bio);
		KostagramExample.pstmt.setString(5, profile_pic);
		
		int resultRow = KostagramExample.pstmt.executeUpdate();
		if (resultRow != 0) {
			System.out.println("가입 완료");
		} else {
			System.out.println("가입 실패");
		}
		
	}

	@Override
	public void delUser() {
		System.out.println("\n =========================== 회원탈퇴 ==============================");
//		String sql = "update users"
		
	}

	@Override
	public void addFollow() {
		System.out.println("\n =========================== 회원탈퇴 ==============================");
		
	}

	@Override
	public void delFollow() {
		System.out.println("\n =========================== 회원탈퇴 ==============================");
		
	}

	@Override
	public void getFollowList() {
		System.out.println("\n =========================== 회원탈퇴 ==============================");
		
	}

	
	
	
	
}
