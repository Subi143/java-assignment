package com.assignment.Q4_1;

public class Person {
	private String name;
	private float age;
	
	
	
	public Person() {
		super();
	}

	public Person(String name, float age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "\nName=" + name + "\nAge=" + age;
	}

}
