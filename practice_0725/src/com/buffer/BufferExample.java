package com.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferExample {
	public static void main(String[] args) {
		
		// 복사, 붙여넣기 할 경로
		String inputPath = "C:\\Users\\WD\\input.txt";
		String outputPath = "C:\\Users\\WD\\output.txt";
		
		try {
			// 파일 읽기용 버퍼
			BufferedReader br = new BufferedReader(new FileReader(inputPath));
			// 파일 쓰기용 버퍼
			BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath));
			
			String line;
			
			// 파일 복사 붙여넣기 기능
//			while (true) {
//				line = br.readLine(); 
//				if (line == null) break; 
//				bw.write(line);
//				bw.newLine(); // 각 라인마다 새로운 줄 추가
//			}
			
			// 간소화
			while ((line = br.readLine()) != null) { // 파일의 각 줄을 읽음
				bw.write(line); // 읽은 줄을 다른 파일에 작성
				bw.newLine(); // 각 라인마다 새로운 줄 추가
			}
			
			bw.flush();
			br.close();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
