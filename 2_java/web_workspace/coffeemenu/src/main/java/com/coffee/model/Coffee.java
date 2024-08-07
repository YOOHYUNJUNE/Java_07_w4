package com.coffee.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Coffee {
	
	private int id, price, caffeine, sugar;
	private String name, img, detail;
	
	// id 외 객체 생성
	public Coffee(String name, String img, int price, int caffeine, int sugar, String detail) {
	}
}
