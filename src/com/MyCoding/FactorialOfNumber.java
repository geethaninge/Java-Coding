package com.MyCoding;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number to check for factorial: ");
		int num = scn.nextInt();
		int fact=1;
		if(num==0 || num==1){
			System.out.println("factorial of" +num+ "is :"+num);
		}
		else{	
		/*for(int i=num;i>=2;i--){
			num =num*(i-1);
		}*/
		
		for(int i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("factorial of a given number is :"+fact);
		}            
	}

}
