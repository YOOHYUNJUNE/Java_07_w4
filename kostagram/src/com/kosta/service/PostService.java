package com.kosta.service;

public interface PostService {

	// postMenu
	
	void getPostList(); // [1] 전체 게시물

	void addPost(); // [2] 게시물 등록

//	void getPost();
	
	
	// postSubMenu
	
	void delPost(); // [4] 게시물 삭제
	
	void modifyPost(); // [3] 게시물 수정 

	void addLike(); // [1] 게시물 좋아요

	void delLike(); // [2] 좋아요 취소
	
}
