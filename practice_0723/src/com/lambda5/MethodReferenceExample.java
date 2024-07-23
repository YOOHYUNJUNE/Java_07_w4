package com.lambda5;

public class MethodReferenceExample {
	public static void main(String[] args) {
		
		Person p = new Person();
		
//		CalculateService cs = new CalculateService();
		
//		p.action((x, y) -> CalculateService.sum(x, y));
//		p.action((x, y) -> CalculateService.multiply(x, y));
//		
//		System.out.println();
		
		// 메소드 참조
		p.action(CalculateService :: sum);
		p.action(CalculateService :: multiply);
		
		
	}
}
