package com.collection.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(5));
		coinBox.push(new Coin(1));

		while(!coinBox.isEmpty()) {
//			Coin c = coinBox.peek(); // 꺼내지 않고 구성을 보기만 함
			Coin c = coinBox.pop();
			System.out.println("꺼낸 동전 : " + c.getValue() + "원 꺼냄. " + coinBox.size() + "개 남음");
		}
		
		
		
	}
}	
