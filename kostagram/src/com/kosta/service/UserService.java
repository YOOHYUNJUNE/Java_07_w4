package com.kosta.service;

import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;

import com.kosta.controller.KostagramExample;
import com.kosta.dao.UserDAO;
import com.kosta.model.User;

// Service : 비지니스 로직 수행
public class UserService {
	
	private UserDAO userDao = new UserDAO();
	
	

	// private ----------------------------------------
	
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
	
	
	// 유저 정보 // dao의 getUser로 이동
	private User getUser(int id) throws Exception {
		User user = userDao.getUser(id);
		return user;
	}
	
	
	
	
	// public -----------------------------------------------
	
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
			System.out.println(name + "님 회원가입이 완료되었습니다 :)");			
		} else {
			System.out.println("\n 회원가입 실패");
		}
		
	}

	// 회원탈퇴
	public void withdrawalUser() throws Exception {
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


	// 유저 전체 조회
	public void printAllUsers() throws Exception {
		System.out.println("\n ---------- 회원 전체를 출력합니다. ----------");
		List<User> userList = userDao.getUserList();
		System.out.println("iD\t이름\t이메일");
		System.out.println("----------------------");
		
		for (User user : userList) {
			System.out.println(
				user.getId() + "\t" + 
				user.getName() + "\t" +
				user.getEmail()
			);
		}
		
	}

	
	// 팔로우
	public void followUser() throws Exception {
		printAllUsers();
		// 팔로우 하는 사람
		System.out.println("자신의 ID를 입력하세요.");
		int user_id = Integer.parseInt(getInput("ID", true)) ;
		User user = getUser(user_id);
		System.out.println("\n ----- " + user.getName() + "님이 팔로우합니다. -----");
		
		// 팔로우 받는 대상
		System.out.println("누구를 팔로우 하시겠습니까?");
		int target_id = Integer.parseInt(getInput("팔로우 할 대상의 ID", true));
		User target = getUser(target_id);
		
		// 자기 자신은 못하게
		if (user_id == target_id) {
			System.out.println("자신은 팔로우 할 수 없습니다.");
		} else {
			// 팔로우 하는사람, 받는 사람
			int resultRow = userDao.addFollower(user_id, target_id);			
			if (resultRow > 0) {
				System.out.println(user.getName() + "님이 " + target.getName() + "님을 팔로우 했습니다.");
				// user의 모든 팔로우 리스트 출력
				System.out.println(user.getName() + "님이 팔로우하고 있는 다른 유저 : " + target.getName() + "님");
				printAllFollowers(user_id);
				
			}
		}		
	}

	// 모든 팔로우 리스트 출력
	public void printAllFollowers(int id) throws Exception {
		List<User> userList = userDao.getFollowers(id);
		System.out.println("iD\t이름\t이메일");
		System.out.println("----------------------");

		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName()				
			);
		}
	}


	
	// 언팔로우
	public void unfollowUser() throws Exception {
		printAllUsers();
		// 언팔로우 하는 사람
		System.out.println("자신의 ID를 입력하세요.");
		int user_id = Integer.parseInt(getInput("ID", true)) ;
		User user = getUser(user_id);
		System.out.println("\n ----- " + user.getName() + "님이 언팔로우합니다. -----");
		
		// 언팔로우 받는 대상
		System.out.println("누구를 언팔로우 하시겠습니까?");
		int target_id = Integer.parseInt(getInput("언팔로우 할 대상의 ID", true));
		User target = getUser(target_id);
		
		// user의 모든 팔로우 리스트 출력
		System.out.println(user.getName() + "님이 팔로우하고 있는 다른 유저 : " + target.getName() + "님");
		printAllFollowers(user_id);
		
		// 언팔로우 하는사람, 언팔되는 사람
		int resultRow = userDao.deleteFollower(user_id, target_id);			
		if (resultRow > 0) {
			System.out.println(user.getName() + "님이 " + target.getName() + "님을 언팔로우 했습니다.");
			
				
			
		}
		
	}
	
	
	
	
	
	
}
