package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 적용 가능한 범위(클래스, 필드, 메소드) 설정
@Target({ ElementType.METHOD, ElementType.FIELD })

// 유지 정책
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {
	
	
	String value();
	String prop1(); // 기본값이 없는 값
	int prop2() default 1;
	
	

}
