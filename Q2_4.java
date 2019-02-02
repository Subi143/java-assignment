package com.assignment;

import java.util.Scanner;

public class Q2_4 {
	static Person1 person = new Person1("Ram", "Raja", 'M');
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Mobile Number: ");
		long mob = scanner.nextLong();
		display(mob);
	}
	
	public static void display(long mob) {
		System.out.println(person + "\nMobile Number:"+mob);
	}
}

class Person1 {
	private String f_Name;
	private String l_Name;
	private char gender;
	
	public Person1(String f_Name, String l_Name, char gender) {
		super();
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Person Details \n______________ \n\nFirst Name: " + f_Name + "\nLast Name: " + l_Name + "\nGender: " + gender;
	}
}
