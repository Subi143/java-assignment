package com.assignment;

import java.util.Scanner;

public class Q2_5 {
	static Person2 person = new Person2("Ram", "Charan", "M");
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Mobile Number: ");
		long mob = scanner.nextLong();
		Gender gender[] = Gender.values();
		System.out.print("\nEnter Gender: ");
		String gen = scanner.next();
		
		for (int i = 0; i < gender.length; i++) {
			if(gen.equals(gender[i].toString())) {
				display(mob, gen);
				System.exit(0);
			}
		}
		System.out.println("Invalid Gender.....");
	}

	public static void display(long mob, String gen) {
		System.out.println(person + "\nMobile Number:"+mob+"\nGender: "+gen);
	}
}

enum Gender {
	M, F, m, f
}

class Person2 {
	private String f_Name;
	private String l_Name;
	private String gender;

	public Person2(String f_Name, String l_Name, String gender) {
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