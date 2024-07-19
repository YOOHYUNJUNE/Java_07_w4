package com.object;

public class MemberExample {
	public static void main(String[] args) {
		
		Member m1 = new Member("유현준");
		Member m2 = new Member("유현준");
		Member m3 = new Member("홍길동");
		Member m4 = m1;
		
		System.out.println("m1 메모리주소 : " + m1);
		System.out.println("m2 메모리주소 : " + m2);
		System.out.println("m3 메모리주소 : " + m3);
		System.out.println("m4 메모리주소 : " + m4);

		System.out.println();
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
		System.out.println();
		
		// 오버라이딩 해서 비교했기 때문
		if (m1.equals(m2)) {
			System.err.println("m1과 m2는 [같음]");
		} else {
			System.out.println("m1과 m2는 [다름]");
		}
		
		if (m1.equals(m3)) {
			System.err.println("m1과 m3는 [같음]");
		} else {
			System.out.println("m1과 m3는 [다름]");
		}
		
		if (m2.equals(m3)) {
			System.err.println("m2과 m3는 [같음]");
		} else {
			System.out.println("m2과 m3는 [다름]");
		}
		
		
	}
}
