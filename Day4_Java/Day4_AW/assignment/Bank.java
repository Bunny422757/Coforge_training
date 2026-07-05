package com.coforge.day4.assignment;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails bank = new BankDetails(1,2000);
		bank.deposit(250);
		bank.withdrawal(1000);
		bank.checkBalance();
	}

}
