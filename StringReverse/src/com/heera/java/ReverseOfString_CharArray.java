package com.heera.java;

public class ReverseOfString_CharArray {

	public static void main(String[] args) {
		String input = "Java Programming";
		// convert String to character array using toCharArray
		char[] input1 = input.toCharArray();
		
		for (int i = input1.length-1; i >= 0; i--)
			System.out.print(input1[i]);
	}
}
