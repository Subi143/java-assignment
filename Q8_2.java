package com.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Q8_2 {
	public static void main(String[] args) throws IOException {
		String file1 = "./src/com/assignment/numberinput.txt";		
		FileReader fileReader = new FileReader(file1);	
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		Scanner scanner =new Scanner(fileReader);
		while (scanner.hasNext()) {
			String str = scanner.next();
			int[] arr = new int[str.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) str.charAt(i);
				if(arr[i]%2 == 0) {
					System.out.print((char)arr[i]+",");
				}
			}
		}
	}
}
