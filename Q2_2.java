package com.assignment;

public class Q2_2 {

	public static void main(String[] args) {
		
		if(Integer.parseInt(args[0]) > 0)
			System.out.println(args[0]+" Is Positive....");
		else if(Integer.parseInt(args[0]) < 0)
			System.out.println(args[0]+" Is Negative....");
		else
			System.out.println(args[0]+" Is Zero....");
	}
}
