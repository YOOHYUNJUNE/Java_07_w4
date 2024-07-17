package com.practice06;

public class ParseExample2 {

	public static void main(String[] args) {
		String strByte = "10";
		byte bytevalue = Byte.parseByte(strByte);
		
		short shortValue = Short.parseShort("200");
		
		String strInt = "200";
		int intValue = Integer.parseInt(strInt);
		
		long longValue = Long.parseLong("4000000");
		
		float floatValue = Float.parseFloat("12.345");
		
		double doubleValue = Double.parseDouble("12.345");

		boolean boolValue = Boolean.parseBoolean("true");
		System.out.println(boolValue);
		
		String x = "10";
		String y = "20";
		System.out.println(x + y);
		
		int xValue = Integer.parseInt(x);
		int yValue = Integer.parseInt(y);
		System.out.println(xValue + yValue);

	}

}
