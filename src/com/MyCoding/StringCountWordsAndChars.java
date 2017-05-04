package com.MyCoding;

import java.util.Scanner;

public class StringCountWordsAndChars {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scn.nextLine();
		if (str.isEmpty() || str.trim().length() == 0) {
			System.out.println("string is empty!");
		}
		String[] words = str.trim().split("\\s+");
		System.out.println(" Word count is = " + (words.length));
		int charCount = str.replaceAll("\\s+", "").length();
		System.out.println("non white space charter count :" + charCount);

	}

}
