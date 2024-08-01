package com.kosta.service;

import java.util.List;

import com.kosta.controller.KostagramExample;
import com.kosta.dao.PostDAO;
import com.kosta.dao.UserDAO;
import com.kosta.model.Post;
import com.kosta.model.User;

// Service : 비지니스 로직 수행
public class PostService {

	private PostDAO postDao = new PostDAO();
	private UserDAO userDao = new UserDAO();
	
	// private ----------------------
	
	// 입력값 함수 getInput
	// isRequire : null이 허용 안되는 컬럼 true
	private String getInput(String name, boolean isRequire) {
		System.out.println(name + " 입력 : ");
		String input = KostagramExample.sc.nextLine();
		
		// 필수 입력칸 외 빈 값일경우 null
		if (input.equals("") && isRequire == false) {
			input = null;
		} else {
			// 필수 입력칸이 비어있으면, 무한 루프
			while (input.equals("") && isRequire == true) {
				input = getInput(name, isRequire);
			}
		}
		return input;
	}
	
	
	// 게시글 정보 // dao의 getPost로 이동
	private Post getPost(int id) throws Exception {
		Post post = postDao.getPost(id);
		return post;
	}
	
	
	
	
	
	// 유저 정보 // dao의 getUser로 이동
		private User getUser(int id) throws Exception {
			User user = userDao.getUser(id);
			return user;
		}
	
	
	
	
	
	
	// public -----------------------------------------------

	
	// 글 작성
	public void writePost() throws Exception {
		System.out.println("\n ---------- 게시글을 작성합니다. ----------");
		
		List<User> userList = userDao.getUserList();
		System.out.println("ID\t이름");
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
		
		
		// User에서 user 이름 가져오기
		int user_id = Integer.parseInt(getInput("유저ID", true));
		User user = userDao.getUser(user_id);
		
		// id가 있는 유저만 작성 가능하게 하기
		if (user == null) {
			System.out.println("없는 유저입니다.");
			return;
		}
		System.out.println("내용 : ");
		
		// 게시글, 이미지는 둘중 하나만 작성해도 가능하게
		String content = getInput("게시글", false);
		String image = getInput("이미지", true);
		
		// DTO 모델 생성
		Post newPost = new Post(0, user_id, content, image, null, null, null);
		
		// 데이터 삽입 동작 수행
		int resultRow = postDao.addPost(newPost);
		
		// 결과 출력
		if (resultRow > 0) {
			System.out.println(user.getName() + "님의 게시글이 작성되었습니다.");
		} else {
			System.out.println("\n 게시글 작성 실패");
		}
	}
	
	
	
	
	// 게시글 수정
	public void modifyPost() throws Exception {
		printAllPosts();
		System.out.println("\n ---------- 게시글 수정 ----------");
		
		// user 정보 가져오기
//		int user_id = Integer.parseInt(getInput("유저ID", true));
//		User user = userDao.getUser(user_id);
		
		// Post에서 post 이름 가져오기
		int post_id = Integer.parseInt(getInput("게시물ID", true));
		Post post = postDao.getPost(post_id);
		
		if (post == null) {
			System.out.println("없는 게시물입니다.");
			return;
		}
		
		String content = getInput("게시글 내용", false);
		String image = getInput("게시글 이미지 파일명", false);
		
		if (content != null) post.setContent(content);
		if (image != null) post.setImage(image);
		
		int resultRow = postDao.updatePost(post);

		if (resultRow > 0) {
//			System.out.println(userDao.getUser(user_id) + "님의 게시글이 수정되었습니다.");
			System.out.println("게시글이 수정되었습니다.");
		} else {
			System.out.println("\n 게시글 수정 실패");
		}
	}
	
	
	
	
	// 모든 게시물 출력
	public void printAllPosts() throws Exception {
		System.out.println("\n ---------- 게시글 목록 ----------");
		
		List<Post> userPost = postDao.getPostList();
		System.out.println("iD\t작성자\t내용\t이미지");
		System.out.println("----------------------");
		
		for (Post post : userPost) {
			User writer = userDao.getUser(post.getUser_id());
			
			String writerName = writer == null ? "탈퇴한 사용자" : writer.getName();
			
			System.out.println(
				post.getId() + "\t" + 
				writer.getName() + "\t" +
				post.getContent() + "\t" + post.getImage()
			);
		}

		
	}

	
	
	
	// 게시물 삭제
	public void deletePost() throws Exception {
		printAllPosts();
		System.out.println("\n ---------- 게시물을 삭제합니다. ----------");
		int postId = Integer.parseInt(getInput("삭제할 게시물 ID", true));
		Post post = getPost(postId);
		
		if (post != null) {
			System.out.println(post.getId() + "을(를) 정말 삭제하시겠습니까? (Y/N)");
			String answer = KostagramExample.sc.nextLine().toLowerCase(); // 소문자로 인식

			if (answer.equals("y")) { // 삭제여부
				int resultRow = postDao.deletePost(postId);
				if (resultRow > 0) {
					System.out.println("게시물이 삭제 되었습니다.");
					return;
				}
			} else return; 
		}
		System.out.println("존재하지 않는 게시물입니다.");
		
	}

	
	

	public void likePost() throws Exception {
		System.out.println("\n ---------- 좋아요 합니다. ----------");

		// 좋아요 할 사용자 먼저 지정
		List<User> userList = userDao.getUserList();
		System.out.println("ID\t이름");
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
		
		// User에서 user 이름 가져오기
		int userId = Integer.parseInt(getInput("좋아요할 유저ID", true));
		User user = userDao.getUser(userId);
		
		// id가 있는 유저만 작성 가능하게 하기
		if (user == null) {
			System.out.println("없는 유저입니다.");
			return;
		}
		
		
		// 해당 사용자가 좋아요할 게시물 목록
		printAllPosts();
		int postId = Integer.parseInt(getInput("좋아요 할 게시물 ID", true));
		Post post = postDao.getPost(postId);
		
		if (post == null) {
			System.out.println("없는 게시물입니다.");
			return;
		}
		int resultRow = postDao.addLike(userId, postId);
		if (resultRow > 0) {
			System.out.println(user.getName() + "님 : 좋아요~");
		} 
		
	}

	
	

	public void unlikePost() throws Exception {		
		// 좋아요 취소할 사용자 먼저 지정
		List<User> userList = userDao.getUserList();
		System.out.println("ID\t이름");
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
		
		
		// User에서 user 이름 가져오기
		int userId = Integer.parseInt(getInput("좋아요 취소할 유저ID", true));
		User user = userDao.getUser(userId);
		
		// id가 있는 유저만 작성 가능하게 하기
		if (user == null) {
			System.out.println("없는 유저입니다.");
			return;
		}
		
		
		// 해당 사용자가 좋아요 눌렀던 게시물 목록
		List<Post> likedPostList = postDao.getLikedPostListByUser(userId);
		for (Post post : likedPostList) {
			User writer = userDao.getUser(post.getUser_id());
			
			String writerName = writer == null ? "탈퇴한 사용자" : writer.getName();
			
			System.out.println(
				post.getId() + "\t" + 
				writer.getName() + "\t" +
				post.getContent() + "\t" + post.getImage()
			);
		}
		
			// 안 좋아요
			int postId = Integer.parseInt(getInput("좋아요 취소할 게시물 ID", true));
			Post post = postDao.getPost(postId);
			
			if (post == null) {
				System.out.println("없는 게시물입니다.");
				return;
			}
			int resultRow = postDao.deleteLike(userId, postId);
			if (resultRow > 0) {
				System.out.println(user.getName() + "님 : 안 좋아요~");
			} 
		}
	
	
	
	
	
	
	
	
	
}
