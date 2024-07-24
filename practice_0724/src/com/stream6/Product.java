package com.stream6;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

	private int pno;
	private String pName;
	private String pCompany;
	private int price;
}
