package com.assignment;

import java.util.Scanner;

public class Q3_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = scanner.nextLine();
		char ch[] = str.toCharArray();
		System.out.print("\n Menu \n________________");
		System.out.print("\n\n1.Add The String To Itself \n2.Replace # In Odd Position \n3.Remove Duplicate Character In The String "
				+ "\n4.Change Odd Characters To UpperCase"); 
		System.out.print("\n\nEnter Your Choice: ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1: System.out.print("\nYour Requsest Is Under Process....\n\n");
		System.out.print("Output: "+str+" "+str);
				break;

		case 2: System.out.print("\nYour Requsest Is Under Process....\n\n");
				System.out.print("Output: ");
				for (int i = 0; i < ch.length; i++) {
					if(i%2 == 1)
						System.out.print("#");
					else
						System.out.print(ch[i]);
				}
				break;
		
		case 3: System.out.print("\nYour Requsest Is Under Process....\n\n");
				System.out.print("Output: ");
				System.out.println(duplicate(ch));
				break;
		
		case 4: System.out.print("\nYour Requsest Is Under Process....\n\n");
				System.out.print("Output: ");
				for (int i = 0; i < ch.length; i++) {
					if(i%2 == 1)
						System.out.print(toUpper(ch[i]));
					else
						System.out.print(ch[i]);
				}
				break;
		
		default: System.out.println("\nInvalid Option.....");
				 break;
		}
	}
	
	public static char toUpper(char ch) {
			int val = (int)ch;
			if(val>=97 && val<=122) {
				ch = (char)(val-32);
			}
		return ch;
	}
	
	public static String duplicate(char ch[]) {
		int length = ch.length;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if(ch[i] == ch[j])
				{
					int temp = j;
					for(int k=j+1; k<length ; k++)
	                {
						ch[temp] = ch[k];
	                    temp++;
	                }
					length--;
					j--;
				}
			}
		}
		return String.copyValueOf(ch).substring(0,length);
	}
}
