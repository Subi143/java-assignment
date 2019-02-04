package com.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q7_2 {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("Mobile");
		al.add("Television");
		al.add("Refrigerator");
		al.add("Air Conditioner");
		al.add("Calculator");
		al.add("Laptop");
		al.add("Washing Machine");
		al.add("Computer");
		al.add("Alexa");
		al.add("Tablet");
		
		Collections.sort(al);
		
		for (String productlist : al) {
			System.out.println(productlist);
		}
	}
}
