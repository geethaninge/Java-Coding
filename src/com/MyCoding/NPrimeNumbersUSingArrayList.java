package com.MyCoding;

import java.util.ArrayList;
import java.util.Scanner;

public class NPrimeNumbersUSingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers.add(2);
		Scanner scn = new Scanner(System.in);
		System.out.println("enter range number : ");
		int n = scn.nextInt();
		for (int i = 3; i <= n; i=i+2) {
			Boolean is_prime = true;
			for (Integer prime : primeNumbers) {
				if ((i % prime) == 0) {
					is_prime = false;
				}
			}

			if (is_prime) {
				primeNumbers.add(i);

			}

			
		}
		System.out.println(primeNumbers);
	}

}
