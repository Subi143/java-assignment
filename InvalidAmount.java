package com.assignment.Q4_1;

public class InvalidAmount extends RuntimeException {
	private static final long serialVersionUID = 1L;
	String str;
	public InvalidAmount(String str) {
		
		super(str);
		this.str = str;
	}
}
