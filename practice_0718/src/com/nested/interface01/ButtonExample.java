package com.nested.interface01;

import com.nested.interface01.Button.ClickListener;

public class ButtonExample {
	public static void main(String[] args) {
		
		Button btnOk = new Button();
//		ClickListener cl = new OkListener();
//		btnOk.setClickListener(cl);
		
		// 로컬 클래스를 매개 변수 안에 넣기 : 익명 객체 
		btnOk.setClickListener(new ClickListener() {
//			// 로컬 클래스
//			class OkListener implements ClickListener {
				@Override
				public void onClick() {
					System.out.println("OK 버튼 눌렀습니다.");
				}
//			}
		});
		btnOk.click();
		
		
		// 취소 버튼
		Button btnCancel = new Button();
		
		// lambda 식
		btnCancel.setClickListener(() -> System.out.println("취소합니다."));
		btnCancel.click();
		
		
		
	}
}
