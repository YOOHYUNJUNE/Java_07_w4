package b;

import a.ClassName;

public class B {
	public static void main(String[] args) {
		
		byte byteValue = 1;
		short shortValue = 1;
		int intValue = 1;
		
		// 생성자 접근제한
		ClassName cn1 = new ClassName(byteValue);
//	ClassName cn2 = new ClassName(shortValue); // default : 같은 패키지에서만 가능
//	ClassName cn3 = new ClassName(intValue); // private : 같은 객체에서만 가능
		
		
		// 필드, 메소드 접근제한
		ClassName cn = new ClassName(); // 기본 생성자(public) 호출
		System.out.println(cn.publicField);
//		System.out.println(cn.defaultField); // default : 같은 패키지에서만 가능
//		System.out.println(cn.privateField); // private : 같은 객체에서만 가능
		
		cn.publicMethod();
//		cn.defaultMethod(); // default : 같은 패키지에서만 가능
//		cn.privateMethod(); // private : 같은 객체에서만 가능
		
		
		
		
		
	}
	

	
}
