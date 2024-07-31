package com.kosta.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Post {
	private int id;
	private User writer; // user 정의
	private String content, image;
	private Date created_at, updated_at, deleted_at;
	
}
