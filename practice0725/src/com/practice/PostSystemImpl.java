package com.practice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PostSystemImpl implements PostSystem {

	// 특정 작성자(author)가 작성한 게시물들을 필터링하여 반환하는 메소드
	@Override
	public List<Post> filterPostsByAuthor(List<Post> posts, String author) {
		return posts.stream()
			.filter(e -> e.getAuthor().equals(author)).toList(); // .collector(Collectors.toList());
	}

	// 모든 게시물의 댓글을 추출하여 리스트로 반환하는 메소드
	@Override
	public List<Comment> getAllComments(List<Post> posts) {
		return posts.stream()
			.flatMap(c -> c.getComments().stream()).toList();
	}

	
	// 모든 게시물의 제목을 추출하여 리스트로 반환하는 메소드
	@Override
	public List<String> getAllPostTitles(List<Post> posts) {
		return posts.stream()
				.map(t -> t.getTitle()).toList();
	}

	
	// 특정 키워드(keyword)를 포함하는 게시물들을 필터링하여 반환하는 메소드
	@Override
	public List<Post> filterPostsByKeyword(List<Post> posts, String keyword) {
		return posts.stream()
			.filter(c -> c.getContent().contains(keyword) 
						|| c.getTitle().contains(keyword)).toList();
	}

	
	// 각 게시물의 댓글 수를 계산하여 맵 형태로 반환하는 메소드
	// 게시물 ID를 키로 하고 댓글 수를 값으로 하는 맵
	@Override
	public Map<Integer, Integer> getCommentCountByPost(List<Post> posts) {
		return posts.stream()
				.collect(Collectors.toMap(
						c -> c.getId(), 
						c -> c.getComments()
				.size()));
	}

	
	// 최신 게시물 3개를 추출하여 리스트로 반환하는 메소드
	@Override
	public List<Post> getLatestPosts(List<Post> posts) {
		return posts.stream()
				.sorted((e1, e2) -> e2.getCreatedAt().compareTo(e1.getCreatedAt()))
				// 3개만 가져오기
				.limit(3).toList();
	}

	// 게시물 번호 중 가장 높은 게시물 번호 반환
	public int getHighestPostId(List<Post> posts) {
		Optional<Post> optmaxPost = posts.stream()
				.max(Comparator.comparing(i -> i.getId()));
		
		Post p = optmaxPost.orElse(null);
		
		return p == null ? 0 : p.getId();
	}

	@Override
	public void insertPost(List<Post> pList) {
		System.out.println("게시물 작성");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.println("내용 입력 : ");
		String content = sc.nextLine();
		
		System.out.println("이름 입력 : ");
		String author = sc.next();
		
		pList.add(new Post(getHighestPostId(pList) + 1, title, content, author, LocalDateTime.now(), new ArrayList<Comment>()));
		sc.close();
	}
	
	
}
