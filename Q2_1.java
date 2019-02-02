package com.assignment;

public class Q2_1 {

	public static void main(String[] args) {
		
		PersonInfo personInfo = new PersonInfo("Subrat", "Dash", 'M', 23, 78.50);
		System.out.println(personInfo);
	}
}

class PersonInfo {
	private String f_Name;
	private String l_Name;
	private char gender;
	private int age;
	private double weight;
	
	public PersonInfo(String f_Name, String l_Name,char gender, int age, double weight) {
		super();
		this.f_Name = f_Name;
		this.l_Name = l_Name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person Details \n______________ \n\nFirst Name: " + f_Name + "\nLast Name: " + l_Name + "\nGender: " + gender + "\nAge: " + age
				+ "\nWeight: " + weight;
	}
	
}