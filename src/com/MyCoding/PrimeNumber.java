package com.MyCoding;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number : ");
		int num = scn.nextInt();
		boolean is_prime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				is_prime = false;
			}
		}
		if (is_prime) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not  a prime number");
		}

	}

}
