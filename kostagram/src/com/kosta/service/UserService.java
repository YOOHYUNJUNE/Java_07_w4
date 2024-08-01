package com.kosta.service;

import com.kosta.controller.KostagramExample;
import com.kosta.dao.UserDAO;
import com.kosta.model.User;

// Service : 비지니스 로직 수행
public class UserService {
	
	private UserDAO userDao = new UserDAO();
	
	

	// 
	private String getInput(String name, boolean isRequire) {
		System.out.println(name + " 입력 : ");
		String input = KostagramExample.sc.nextLine();
		
		// 필수 입력칸 외 빈 값일 경우 null
		if (input.equals("") && isRequire == false) {
			input = null;
		} else {
			// 필수 입력칸이 비어있을 경우, 계속 입력
			while (input.equals("") && isRequire == true) {
				input = getInput(name, isRequire);
			}
		}
		
		return input;
	}
	
	// 회원가입
	public void signUpUser() throws Exception {
		System.out.println("\n ---------- 회원가입을 진행합니다. ----------");
		
//		System.out.println("이름 입력 : ");
//		KostagramExample.sc.nextLine();
		String name = getInput("이름", true);	
		String email = getInput("이메일", true);
		String pw = getInput("비밀번호", true);
		String bio = getInput("소개글", false);
		String profile = getInput("프로필 사진 파일명", false);

		// DTO 모델 생성
		User newUser = new User(0, name, email, pw, bio, profile, null, null, null);
		
		// 데이터 삽입 동작 수행
		int resultRow = userDao.addUser(newUser);
		
		// 결과 출력
		if (resultRow > 0) { // id를 1 이상으로 설정
			System.out.println("\n\n 회원가입이 완료되었습니다 :)");			
		} else {
			System.out.println("\n 회원가입 실패");
		}
		
	}

	// 회원탈퇴
	public void withdrawlUser() throws Exception {
		System.out.println("\n ---------- 회원탈퇴를 진행합니다. ----------");
		int user_id = Integer.parseInt(getInput("사용자 ID", true));
		
		// user_id로 유저 정보 가져오기
		User user = getUser(user_id);
		
		if (user != null) {
			System.out.println(user.getName() + "을(를) 정말 탈퇴하시겠습니까? (Y/N)");
			String answer = KostagramExample.sc.nextLine().toLowerCase(); // 소문자로 인식

			if (answer.equals("y")) { // 삭제여부
				int resultRow = userDao.deleteUser(user_id);
				if (resultRow > 0) {
					System.out.println("회원탈퇴 되었습니다.");
					return;
				}
			} else return; 
		}
		System.out.println("이미 탈퇴되었거나 없는 사용자입니다.");
		
	}

	// 유저 정보 // dao의 getUser로 이동
	private User getUser(int id) throws Exception {
		User user = userDao.getUser(id);
		return user;
	}
	
	
	
	
	
	
}
