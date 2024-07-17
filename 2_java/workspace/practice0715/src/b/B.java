package b;

import a.ClassName;

public class B {
	public static void main(String[] args) {
		byte byteValue = 1;
		short shortValue = 1;
		int intValue = 1;
		
		// 다른 패키지에서 생성자 호출
		
		// public은 다른 패키지에서도 접근 가능
		ClassName cn1 = new ClassName(byteValue);
		// default는 같은 패키지 내에서만 접근 가능
		// ClassName cn2 = new ClassName(shortValue);
		// private는 같은 객체 내에서만 접근 가능
		// ClassName cn3 = new ClassName(intValue);
		
		ClassName cn = new ClassName();
		// 다른 패키지에서 필드 호출
		System.out.println(cn.publicField);
		// System.out.println(cn.defaultField);
		// System.out.println(cn.privateField);
		// 다른 패키지에서 메소드 호출
		cn.publicMethod();
		// cn.defaultMethod();
		// cn.privateMethod();
	}
}
