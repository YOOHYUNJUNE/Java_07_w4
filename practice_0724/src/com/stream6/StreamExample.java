package com.stream6;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) throws IOException {
		
		String absolutePath = "C:\\Users\\WD\\Documents\\유현준\\workspace\\data.txt";
		Path path = Paths.get(absolutePath);
		
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
//		stream.forEach(System.out::println);
		stream.forEach(l -> {
			String[] prodInfo = l.split(" "); // 상품 정보 배열(띄어쓰기로 구분) 생성
			int pno = Integer.parseInt(prodInfo[0]);
			String pName = prodInfo[1];
			String pCompany = prodInfo[2];
			int price = Integer.parseInt(prodInfo[3]);
			
			Product p = new Product(pno, pName, pCompany, price);
			System.out.println(p);
		});
		
		stream.close();
		
		
	}
}
