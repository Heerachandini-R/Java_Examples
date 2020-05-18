package com.heera.java;

public class ReverseWordsOfAString1 {

	public static void main(String[] args) {
		// Java program to reverse a string
		// s = input()
		String s[] = "I Am Heera Chandini".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans += s[i] + " ";
		}
		System.out.println("Reversed String: " );
		System.out.println(ans.substring(0, ans.length()-1));
	}
}