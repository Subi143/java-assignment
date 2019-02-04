package com.assignment.Q4_1;

import java.util.Random;
import java.util.Scanner;
public class AccountMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		System.out.println(" WELCOME TO MPHASIS BANK \n----------------------");
		long accNum = random.nextInt(100235500);
	
		Person accHolder1 = new Person("Smith", 34);
		Account account1 = new Account(accNum, 2000, accHolder1);
		System.out.println(account1);
		
		double bal1 = account1.deposit(2000);
		System.out.print("\nBalance After Deposit: "+bal1);
		
		Person accHolder2 = new Person("Kathy", 26);
		Account account2 = new Account(accNum, 3000, accHolder2);
		System.out.println(account2);
		
		double bal2 = account2.withdraw(2000);
		System.out.print("\nBalance After Withdraw: "+bal2);
	}
}
