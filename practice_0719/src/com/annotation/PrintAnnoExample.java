package com.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnoExample {
	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
		
		// 메소드 1 ~ 3 실행 순서는 랜덤
		Method[] methods = Service.class.getDeclaredMethods();
		for (Method m : methods) {
			PrintAnnotation pa = m.getAnnotation(PrintAnnotation.class);
			print(pa);
			m.invoke(new Service());
			print(pa);
		}
		 
	}
	
	
	public static void print(PrintAnnotation pa) {
		String sign = pa.value();
		int number = pa.number();
		
		for (int i=0; i<number; i++) {
			System.out.print(sign);
		}
		System.out.println();
		
	}
	
	
	
	
	
	
	
}
