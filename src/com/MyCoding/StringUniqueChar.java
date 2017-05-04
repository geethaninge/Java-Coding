package com.MyCoding;

import java.util.Scanner;

public class StringUniqueChar {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scn.next();
		
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (i!=j && str.charAt(i) == str.charAt(j)) {
					count++;
					break;
				}
			}
			if (count==0)
				System.out.println(str.charAt(i));
		}

		scn.close();
	}

}
