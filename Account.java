package com.assignment.Q4_1;

public class Account extends Person {
	long accNum;
	double balance;
	Person accHolder;
	
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public double deposit(double amount) throws InvalidAmount {
		if (amount <= 0)
			throw new InvalidAmount("Can't Deposit Zero.....");
		else
			balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount) throws InvalidAmount {
		if (amount <= 0)
			throw new InvalidAmount("Can't Withdraw Zero.....");
		else if ((balance-amount) < 1000)
			System.out.println("Minimum Balance Should Be 1000...");
		else
			balance = balance - amount;
		return balance;
	}

	@Override
	public String toString() {
		return "\n\n\nAccount Holder Information \n---------------------------" + accHolder+"\nAccount Number: " + accNum + "\nBalance: " + balance;
	}
	
	
}
