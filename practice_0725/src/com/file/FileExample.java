package com.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		
		String dataPath = "C:\\Users\\WD\\data.txt";
		
		File file = new File(dataPath);
//		System.out.println(file.exists()); // false
		
//		// 파일이 없으면 새로 생성
//		if (!file.exists()) {
//			file.mkdirs();
//		}
		
//		if (!file.exists()) {
//			file.createNewFile();
//		}
		
//		if (!file.exists()) {
//			if(!file.getParentFile().exists());
//		}
		
		if (!file.createNewFile()) {
			System.out.println("생성");
		} else {
			System.out.println("이미 존재");
		}
		
		System.out.println();
		
		System.out.println("파일 경로 : " + file.getAbsolutePath());
		System.out.println("쓰기 가능 여부 : " + file.canWrite());
		System.out.println("읽기 가능 여부 : " + file.canRead());
		System.out.println("파일 크기 : " + file.length() + "바이트");
		
		System.out.println();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(dataPath));
		
		bw.write("안녕하세요.");
		bw.newLine();
		bw.write("이번 시간에는");
		bw.newLine();
		bw.write("입출력 스트림을");
		bw.newLine();
		bw.write("배우고 있습니다.");
		bw.newLine();
		bw.write("좋은 기능이네요.");

		bw.flush();
		bw.close();
		
		System.out.println("파일 크기 : " + file.length() + "바이트");

		
		
		
		
		
		
	}
}
