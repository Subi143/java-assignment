package com.assignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Q3_3 {
	
	public static void main(String[] args) throws ParseException {
			 Scanner scanner = new Scanner(System.in);
			 System.out.print("Enter a Date(in yyyy-MM-dd format) :");
			 String dayYouWant = scanner.nextLine();
			 SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
			 LocalDate now = java.time.LocalDate.now();
			 String todaysDate = now.toString();

			 try {
			       Date dateBefore = myFormat.parse(todaysDate);
			       Date dateAfter = myFormat.parse(dayYouWant);
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