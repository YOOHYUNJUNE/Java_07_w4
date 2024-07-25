package com.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		
		// 바이트 스트림 입력
		try {
			InputStream is = new FileInputStream("C:\\Users\\WD\\output.txt");
			
//			while(true) {
//				int data = is.read();
//				if (data == -1) break;
//				System.out.println((char) data);
//			}
			
			// 배열로 가져오기
			byte[] data = new byte[4];
			
			while(true) {
				int num = is.read(data);
				if(num == -1) break;
				System.out.println(num);
			}
			for (byte b : data) {
				System.out.println(b);
			}
			
			
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
