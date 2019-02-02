package com.assignment;

public class Q2_3 {

	public static void main(String[] args) {
		
		Person person = new Person("Subrat", "Dash", "M");
		System.out.println(person);
	}
}
class Person {
	private String f_Name;
	private String l_Name;
	private String gender;
	
	public Person(String f_Name, String l_Name, String gender) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person Details \n______________ \n\nFirst Name: " + f_Name + "\nLast Name: " + l_Name + "\nGender: " + gender;
	}
	
	
}
