package com.heera.java;

public class StringTest {

	public static void main(String[] args) {
		String s1 = "edureka";
		String s2 = "edureka";
		s1.concat("bangalore");
		System.out.println(s1);

		s1 = s1.concat("bangalore");
		System.out.println(s1);
	}
}
