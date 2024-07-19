package com.string;

import java.util.Arrays;

public class ByteToStringExample {
	public static void main(String[] args) throws Exception {
		
		String data = "유현준"; // utf-8
		byte[] arr1 = data.getBytes();
		System.out.println(Arrays.toString(arr1));
		
		String str1 = new String(arr1); // utf-8
//		String str1 = new String(arr1, "EUC-KR");
//		String str1 = new String(arr1, "CP949");
		
		System.out.println(str1);
		
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println(Arrays.toString(arr2));
		
//		String str2 = new String(arr2, "EUC-KR");
		String str2 = new String(arr2, "CP949");
		System.out.println(str2);
		
		
		
	}
}
