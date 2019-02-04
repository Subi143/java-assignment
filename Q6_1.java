package com.assignment;

import java.util.Scanner;
public class Q6_1 {

public static void main(String[] args) throws NameException {
		Scanner scanner = new Scanner(System.in);
		/*System.out.print("Enter First Name: ");
		String fname = scanner.next();
		System.out.println("\nEnter Last Name: ");
		String lname = scanner.next();
		System.out.println("\nEnter Gender(M/F): ");
		char gender = scanner.next().charAt(0);
		if(fname.isEmpty() && lname.isEmpty())
			throw new NameException("Name Field Should Not Be Blank");
		Personn person = new Personn(fname, lname, gender);
		System.out.println(person);*/
		
		
		String fname = "";
		String lname = "";
		System.out.println("\nEnter Gender(M/F): ");
		char gender = scanner.next().charAt(0);
		if(fname.isEmpty() && lname.isEmpty())
			throw new NameException("Name Field Should Not Be Blank");
		Personn person = new Personn(fname, lname, gender);
		System.out.println(person);
	}
}

class Personn {
	private String f_Name;
	private String l_Name;
	private char gender;
	
	public Personn(String f_Name, String l_Name, char gender) {
		super();
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.gender = gender;
	}

	public String getF_Name() {
		return f_Name;
	}

	public void setF_Name(String f_Name) {
		this.f_Name = f_Name;
	}

	public String getL_Name() {
		return l_Name;
	}

	public void setL_Name(String l_Name) {
		this.l_Name = l_Name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person Details \n______________ \n\nFirst Name: " + f_Name + "\nLast Name: " + l_Name + "\nGender: " + gender;
	}
		
}


class NameException extends Exception
{
	public NameException() {
    }
    
    public NameException(final String message) {
        super(message);
    }
}