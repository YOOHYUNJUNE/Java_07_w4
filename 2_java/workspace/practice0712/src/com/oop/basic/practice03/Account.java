package com.oop.basic.practice03;

public class Account {
	String account;
	int balance;
	double interestRate;
	
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void withdraw(int money) {
		// 출금
		if (balance < money) {
			// 출금 불가
			System.out.println("출금할 수 없습니다.");
			return;
		}
		balance -= money;
	}

	public void deposit(int money) {
		if (money < 0) {
			return;
		}
		// 입금		
		balance += money;
	}

	public double calculateInterest() {
		// 이자 계산
		// 잔액 * 이율 / 100
		return balance * interestRate / 100;
	}
	
	
	
	
}
