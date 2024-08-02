package com.kosta.service;

import java.util.List;

import com.kosta.controller.KostagramExample;
import com.kosta.dao.PostDAO;
import com.kosta.dao.UserDAO;
import com.kosta.model.Post;
import com.kosta.model.User;

public class PostService {

	private UserDAO userDao = new UserDAO();
	private PostDAO postDao = new PostDAO();
	
	private String getInput(String name, boolean isRequire) {
		System.out.print(name + " 입력 : ");
		String input = KostagramExample.sc.nextLine();
		if (input.equals("") && isRequire == false) {
			input = null;
		} else {
			while (input.equals("") && isRequire == true) {
				input = getInput(name, isRequire);
			}
		}
		return input;
	}
	
	public void writePost() throws Exception {
		System.out.println("\n----- 글쓰기를 진행합니다 -----");
		
		List<User> userList = userDao.getUserList();
		System.out.println("ID\t이름");
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
		
		int userId = Integer.parseInt(getInput("글쓰기 할 사용자 아이디", true));
		User user = userDao.getUser(userId);
		
		if (user == null) {
			System.out.println("없는 사용자입니다.");
			return;
		}
		System.out.println("\n" + user.getName() + " (으)로 게시글을 작성합니다.");			

		String content = getInput("게시글 내용", false);
		String image = getInput("게시 이미지 파일명", true);
		
		Post post = new Post(0, user.getId(), content, image, null, null, null);
		
		int resultRow = postDao.addPost(post);
		if (resultRow > 0) {
			System.out.println("게시물 등록 완료");
		} else {
			System.out.println("게시물 등록 실패");
		}
	}

	public void printAllPosts() throws Exception {
		List<Post> postList = postDao.getPostList();
		System.out.println("ID\t작성자\t내용\t이미지");
		for (Post post : postList) {
			User writer = userDao.getUser(post.getUser_id());
			String writerName = writer == null ? "탈퇴한 사용자" : writer.getName();
			System.out.println(
				post.getId() + "\t" + writerName + "\t" +
				post.getContent() + "\t" + post.getImage()
			);
		}
	}

	public void modifyPost() throws Exception {
		printAllPosts();
		int postId = Integer.parseInt(getInput("수정할 게시물 아이디", true));
		Post post = postDao.getPost(postId);
		
		if (post == null) {
			System.out.println("없는 게시물 입니다.");
			return;
		}
		
		String content = getInput("게시글 내용", false);
		String image = getInput("게시 이미지 파일명", false);
		
		if (content != null) post.setContent(content);
		if (image != null) post.setImage(image);
				
		int resultRow = postDao.updatePost(post);
		if (resultRow > 0) {
			System.out.println("게시물 수정 완료");
		} else {
			System.out.println("게시물 수정 실패");
		}
	}

	public void deletePost() throws Exception {
		printAllPosts();
		int postId = Integer.parseInt(getInput("삭제할 게시물 아이디", true));
		Post post = postDao.getPost(postId);
		
		if (post == null) {
			System.out.println("없는 게시물 입니다.");
			return;
		}
				
		int resultRow = postDao.deletePost(postId);
		if (resultRow > 0) {
			System.out.println("게시물 삭제 완료");
		} else {
			System.out.println("게시물 삭제 실패");
		}
	}

	public void likePost() throws Exception {
		List<User> userList = userDao.getUserList();
		System.out.println("ID\t이름");
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
		
		int userId = Integer.parseInt(getInput("좋아요 할 사용자 아이디", true));
		User user = userDao.getUser(userId);
		
		if (user == null) {
			System.out.println("없는 사용자입니다.");
			return;
		}
		
		// 해당 사용자가 좋아요할 게시물 출력 (게시물 전체)
		printAllPosts();
		int postId = Integer.parseInt(getInput("좋아요 할 게시물 아이디", true));
		Post post = postDao.getPost(postId);
		
		if (post == null) {
			System.out.println("없는 게시물 입니다.");
			return;
		}
		
		int resultRow = postDao.addLike(userId, postId);
		if (resultRow > 0) {
			System.out.println(user.getName() + "님이 해당 게시글을 좋아합니다.");
		}
	}

	public void unlikePost() throws Exception {
		List<User> userList = userDao.getUserList();
		System.out.println("ID\t이름");
		for (User user : userList) {
			System.out.println(user.getId() + "\t" + user.getName());
		}
		
		int userId = Integer.parseInt(getInput("좋아요 취소할 사용자 아이디", true));
		User user = userDao.getUser(userId);
		
		if (user == null) {
			System.out.println("없는 사용자입니다.");
			return;
		}
		
		// 해당 사용자가 좋아요한 게시물 출력 (특정 사용자가 좋아요 한 !!!)
		List<Post> likedPostList = postDao.getLikedPostListByUser(userId);
		for (Post post : likedPostList) {
			User writer = userDao.getUser(post.getUser_id());
			String writerName = writer == null ? "탈퇴한 사용자" : writer.getName();
			System.out.println(
				post.getId() + "\t" + writerName + "\t" +
				post.getContent() + "\t" + post.getImage()
			);
		}
		
		int postId = Integer.parseInt(getInput("좋아요 취소할 게시물 아이디", true));
		Post post = postDao.getPost(postId);
		
		if (post == null) {
			System.out.println("없는 게시물 입니다.");
			return;
		}
		
		int resultRow = postDao.deleteLike(userId, postId);
		if (resultRow > 0) {
			System.out.println(user.getName() + "님이 해당 게시글을 좋아요를 취소하였습니다.");
		}
	}

}
