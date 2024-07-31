package com.output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
	public static void main(String[] args) {
		
		// 바이트 스트림 출력
		try {
			OutputStream os = new FileOutputStream("C:\\Users\\WD\\output.txt");
			
			byte a = 65; // int로 바꿔도 상관없음
			byte b = 66;
			byte c = 67;
//			os.write(a);
//			os.write(b);
//			os.write(c);
			
//			byte[] arr = {68, 69, 70, 71, 72, 73};
//			os.write(arr);
			
			byte[] arr = {65, 66, 67, 76, 79, 86, 69}; // ABCLOVE
			os.write(arr, 3, 4); // [3]번째부터 4개 입력
			
			os.flush();
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
