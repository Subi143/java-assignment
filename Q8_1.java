package com.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q8_1 {

	public static void main(String[] args) throws IOException {

				String file1 = "./src/com/assignment/input.txt";
				String file2 = "./src/com/assignment/output";
				
				FileReader fileReader = new FileReader(file1);
				FileWriter fileWriter = new FileWriter(file2,true);
				
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				
				String data;
				while((data = bufferedReader.readLine()) !=null) {
					
					String[] words = data.split(" ");
					for (String str : words) {
						StringBuilder builder = new StringBuilder(str);
						String temp = builder.reverse().toString();
						System.out.println(temp);
						bufferedWriter.write(temp);
						
					}
					
				}
				bufferedWriter.close();
				fileWriter.close();
	}
}
