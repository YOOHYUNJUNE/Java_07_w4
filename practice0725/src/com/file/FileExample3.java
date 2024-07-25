package com.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.ImageInputStream;

public class FileExample3 {
	public static void main(String[] args) throws IOException {
		
		// image.jpg 파일 복사하여 image2.jpg 파일 만들기
		
		String inputPath = "C:\\Users\\WD\\image.jpg";
		String outputPath = "C:\\Users\\WD\\image2.jpg";

		try (
			BufferedInputStream bi = new BufferedInputStream(new FileInputStream(inputPath));
			BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(outputPath));
		) {
		byte[] buffer = new byte[1024];
		int bytesRead;
		while ((bytesRead = bi.read(buffer)) != -1) {
			bo.write(buffer, 0, bytesRead);
		}
		System.out.println("파일 복사 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
		
		
	}
}
