package com.oop.static_member;

public class Example {

	public static int staticCount = 0;
	public int instanceCount = 0;
	
	public static void incrementStaticCount() { staticCount++; }
	public void incrementInstanceCount() { instanceCount++; }
	
	public static void main(String[] args) {
		// 인스턴스 선언(정적 필드 안에서도 사용 가능)
		Example example1 = new Example();
		Example example2 = new Example();
		
		Example.incrementStaticCount();
		Example.incrementStaticCount();
		
		example1.incrementInstanceCount();
		
		example2.incrementInstanceCount();
		example2.incrementInstanceCount();
		
		System.out.println("Static Count : " + Example.staticCount);
		System.out.println("Example1 Count : " + example1.instanceCount);
		System.out.println("Example1 Count : " + example2.instanceCount);
	}
	
	
}
