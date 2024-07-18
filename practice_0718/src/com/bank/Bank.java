package com.bank;

public class Bank {

	// 은행 클래스, 계좌 클래스
	private String bank;
	// 계좌 수 10개
	private Account[] accounts;
	private int accountCount = 0;
	
	Bank() {}
	

	public Bank(String bank) {
		this.bank = bank;
		this.accounts = new Account[10];
		this.accountCount = 0;
	}


	// 계좌 개설 메소드
		public Account addAcount() {
			accounts[accountCount] = new Account();
			Account acc = accounts[accountCount]; 
			this.accountCount++;
			return acc;
		}


	
	
	///////////////////////////////////////////
	///////////////////////////////////////////
	// 계좌 클래스
	
	class Account {
		
		String accountName; // 계좌번호
		int balance; // 잔고
		
		// 계좌명 설정
		public Account() {
			this.accountName = "A" + (1000 + Bank.this.accountCount);
		}
	

		// 입금 : deposit		
		public void deposit (int money) {
			this.balance += money;
		}
		
		
		// 출금 : withdraw
		public void withdraw(int money) throws MyException {
			if(this.balance >= money) {
				this.balance -= money;
			} else {
//				System.out.println("잔액이 부족합니다.");
				throw new MyException("잔액이 부족합니다.");
			}
		}

		
		

		public int getBalance() {
			return balance;
		}


		public void setBalance(int balance) {
			this.balance = balance;
		}


		public String getAccountName() {
			return accountName;
		}


		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}


		@Override
		public String toString() {
			return "계좌정보 [ accountName=" + accountName + ", balance=" + balance + "원 ]";
		}
		
		
		
		
	}
	
}
