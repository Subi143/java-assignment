package com.assignment;

import java.util.Scanner;
public class Q3_2 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		boolean rs = isPositive(ch);
		if(rs)
			System.out.println("Positive String....");
		else
			System.out.println("Negative String....");
	}
	
	public static boolean isPositive(char ch[]) {
		boolean isPositive = true;
		int length = ch.length;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if((int)(ch[i]) > (int)(ch[j]))
					return false;
			}
		}
		return isPositive;
	}
}
