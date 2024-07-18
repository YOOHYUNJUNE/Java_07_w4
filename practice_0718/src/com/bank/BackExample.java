package com.bank;

public class BackExample {
	public static void main(String[] args) {
		
		Bank a = new Bank("하나은행");
		Bank b = new Bank("기업은행");
		
		Bank.Account acc1000 = a.addAcount();

		System.out.println();
		
		
		try {
			acc1000.deposit(10000);			
			System.out.println(acc1000);
		
			acc1000.withdraw(10000);
			System.out.println(acc1000);
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
