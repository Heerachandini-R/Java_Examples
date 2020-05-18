package com.heera.java;

public class ReverseOfString {

	public static void main(String[] args) {
		String input = "heerachandini";
		// getBytes() method to convert string in to bytes[]
		byte[] strByteArray = input.getBytes();
		byte[] result = new byte[strByteArray.length];
		// store result in reverse order into the result byte[]
		for (int i = 0; i < strByteArray.length; i++)
			result[i] = strByteArray[strByteArray.length - i - 1];

		System.out.println(new String(result));
	}
}