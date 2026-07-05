package com.coforge.day4.assignment;

public class BankDetails {
	private int accnum;
	private double balance;

	public BankDetails(int accnum, double balance) {
		this.accnum = accnum;
		this.balance = balance;
	}

	void deposit(double amt) {
		balance += amt;
	}

	void withdrawal(double amt) {
		if (amt <= balance) {
			balance -= amt;
		}
	}

	void checkBalance() {
		System.out.println("Bank Number : " + accnum);
		System.out.println("Balance : " + balance);
	}

}
