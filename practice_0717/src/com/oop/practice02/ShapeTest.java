package com.oop.practice02;

public class ShapeTest {
	public static void main(String[] args) {
		
		// 배열 생성
		Shape[] shape = new Shape[6];
		
		Triangle t1 = new Triangle(7, 5, "Blue");
		Rectangle r1 = new Rectangle(4, 6, "Blue");
		Triangle t2 = new Triangle(6, 7, "Red");
		Rectangle r2 = new Rectangle(8, 3, "Red");
		Triangle t3 = new Triangle(9, 8, "White");
		Rectangle r3 = new Rectangle(5, 7, "White");
		
		// 배열에 넣기
		shape[0] = t1;
		shape[1] = r1;
		shape[2] = t2;
		shape[3] = r2;
		shape[4] = t3;
		shape[5] = r3;
		
		
		printShapeInfo(shape, "기본정보");

		// setResize()를 가져와서, 사이즈 변경
		for (Shape s : shape) {
			Resize size = (Resize) s;
			size.setResize(5);
		}
		
		printShapeInfo(shape, "변경 후 정보");
		
	}
		
	public static void printShapeInfo(Shape[] shape, String msg) {
		System.out.println(msg);
		System.out.println();
		for (Shape s : shape) {
			if (s instanceof Triangle) {
				Triangle t = (Triangle) s;
				System.out.print("삼각형");
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle) s;
				System.out.print("직사각형");
			}
			System.out.println("\t" + s.getArea() + "\t" + s.getColors());
		}
		System.out.println();
		
		System.out.println(msg);
		System.out.println();
		
		for (Shape s : shape) {
			if (s instanceof Triangle) {
				Triangle t = (Triangle) s;
				System.out.print("삼각형");
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle) s;
				System.out.print("직사각형");
			}
			System.out.println("\t" + s.getArea() + "\t" + s.getColors());
		}
		System.out.println();
	}
		
		
		
		
}
