package a;

public class ClassName {
	byte byteValue;
	short shortValue;
	int intValue;
	
	public int publicField = 1;
	int defaultField = 1;
	private int privateField = 1;
	
	public void publicMethod () {}
	void defaultMethod () {}
	private void privateMethod () {}
	
	public ClassName() {
		publicField = 2;
		defaultField = 2;
		privateField = 2;
		publicMethod();
		defaultMethod();
		privateMethod();
	}
	
	public ClassName(byte byteValue) {
		this.byteValue = byteValue;
	}
	
	ClassName(short shortValue) {
		this.shortValue = shortValue;
	}
	
	private ClassName(int intValue) {
		this.intValue = intValue;
	}
	
	// 같은 객체(클래스) 내에서 생성자 호출
	
	// public은 다른 패키지에서도 접근 가능
	ClassName cn1 = new ClassName(1);
	// default는 같은 패키지 내에서만 접근 가능
	ClassName cn2 = new ClassName(1);
	// private는 같은 객체 내에서만 접근 가능
	ClassName cn3 = new ClassName(1);
}
