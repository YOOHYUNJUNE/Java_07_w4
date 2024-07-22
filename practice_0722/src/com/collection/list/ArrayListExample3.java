package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListExample3 {
	public static void main(String[] args) {
		
		// int 배열
		List<Integer> list = Collections.synchronizedList(new ArrayList<> ());
//		Vector<Integer> list = new Vector<> ();

		// 첫 째 스레드 정의 : 0 ~ 49까지 넣음
		Thread thread0 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=0; i<50; i++) {
					list.add(i);
					
					System.out.println("Thread-0에 [" + i + "] 추가됨");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i=50; i<100; i++) {
					list.add(i);
					
					System.out.println("Thread-1에 [" + i + "] 추가됨");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		thread0.start();
		thread1.start();
		
		try {
			thread0.join();
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("총 길이 : " + list.size());
		System.out.println(list);
		
		
		
		
		
		
	}
}
