package assignment;

import java.util.Arrays;

public class Q7_1 {

	public static void main(String[] args) {
		
		String[] products = new String[] {"Mobile","Television","Refrigerator","AC","Calculator","Laptop"};
		int size = products.length;
		for(int i = 0; i<size-1; i++) {
	         for (int j = i+1; j<products.length; j++) {
	            if(products[i].compareTo(products[j])>0) {
	               String temp = products[i];
	               products[i] = products[j];
	               products[j] = temp;
	            }
	         }
	      }
	      System.out.println(Arrays.toString(products));
	}
}
