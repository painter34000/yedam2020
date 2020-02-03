package com.yedam.hsw.classes;

public class Account {

	private String ano;
	private String owner;
	private int balance; // 우클릭 source / generate getter~ 셋팅 가져오기

	
	
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) {
		if (amount >= 10 && amount <= 100000) {
			balance = balance + amount;

		} else {
			balance = balance + 0;

		}
	}

	public void withdrawBalance(int amount) {
		if (amount >= 10 && amount <= 10000) {
			balance = balance + amount;
		} else {
			balance = 0;
		}
	}

	@Override
	public String toString() {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}

}
