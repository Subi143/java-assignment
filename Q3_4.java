package com.assignment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q3_4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Date(in yyyy-MM-dd format) :");
		String day1 = scanner.nextLine();
		System.out.print("Enter a Date(in yyyy-MM-dd format) :");
		String day2 = scanner.nextLine();
		SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
		       Date dateBefore = myFormat.parse(day1);
		       Date dateAfter = myFormat.parse(day2);
		       long difference = dateBefore.getTime() - dateAfter.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
		       int monthsBetween = (int) (daysBetween/30);
		       int yearsBetween = (int) (daysBetween/365);
		       
	               
		       System.out.println("Number of Days between dates: "+daysBetween);
		       System.out.println("Number of Months between dates: "+monthsBetween);
		       System.out.println("Number of Years between dates: "+yearsBetween);
		 } catch (Exception e) {
		       e.printStackTrace();
		 }
	}
}
