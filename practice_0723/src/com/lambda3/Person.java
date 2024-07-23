package com.lambda3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
	private String name, job, nation;
	
	// 메소드
	public void action1(Workable workable) {
		workable.work(name, job);
	}
	
	public void action2(Speakable speakable) {
		speakable.speak(nation);
	}
	
}
