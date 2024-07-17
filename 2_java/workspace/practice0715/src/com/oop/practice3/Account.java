package com.oop.practice3;

public class Account {
	private int balance;

	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1_000_000;

	public Account(int balance) {
		setBalance(balance);
	}
	
	private int getBalance() {
		return balance;
	}

	private void setBalance(int balance) {
		if (balance >= MIN_BALANCE && MAX_BALANCE >= balance) {
			this.balance = balance;
		}
	}

	public void withdraw(int money) {
		if (money >= MIN_BALANCE) {
			setBalance(balance-money);
		}
	}
	
	public void deposit(int money) {
		if (money >= MIN_BALANCE) {
			setBalance(balance+money);
		}
	}

	public void info() {
		System.out.println("현재 잔고: " + this.getBalance() + "원");
	}
}