package com.heera.java;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		String str = "My Name Is Heera";
		String str1 = "";
		String a[] = str.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");

		for (int i = a.length - 1; i >= 0; i--) {
			if (i == a.length - 1)
				str1 = str1 + a[i];
			else
				str1 = str1 + " " + a[i];
		}
		System.out.println(str1);
	}
}