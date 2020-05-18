package com.heera.java;

public class ReverseOfString_StringBuilder {

	public static void main(String[] args) {
		String str="Heerachandini";
		//string Builder obj
		StringBuilder str1=new StringBuilder(str);
		String reverse=str1.reverse().toString();
		System.out.println(reverse);

	}
}
