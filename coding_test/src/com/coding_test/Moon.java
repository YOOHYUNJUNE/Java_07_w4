package com.coding_test;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
    // 윤년이면 1, 아니면 0
    // 윤년: 4의 배수 && (100의 배수가 아닐 때 || 400의 배수)
    Scanner sc = new Scanner(System.in);
    	
    int year = sc.nextInt();
    
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        year = 1;
    } else {
        year = 0;
    }
    
    System.out.println(year);
    
    
    








    }
}
