package com.oop.basic.practice03;

public class AccountExample {
	public static void main(String[] args) {
		// account 객체 생성
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		// account 객체의 계좌정보 출력 
		System.out.println("계좌정보: " + acc.account + " 현재잔액: " + acc.balance);
		// account 에서 600000원 출금
		acc.withdraw(600000);
		// account 에 20000원 입금
		acc.deposit(20000);
		// account 객체의 계좌정보 출력
		System.out.println("계좌정보: " + acc.account + " 현재잔액: " + acc.balance);
		// 이자 출력 – 현재 잔고를 기준으로 고객에게 줄 이자 금액을 출력 한다
		System.out.println(acc.calculateInterest());
	}
}
