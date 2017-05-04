package com.MyCoding;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class FibonacciSeries {
	
	public void fib(){
		List<Integer> fib = new ArrayList<Integer>();
		fib.add(1);
		fib.add(1);
		 int i=1;
        while(i<7){
        	fib.add(fib.get(i)+fib.get(i-1));
        	i++;
		}
        System.out.println(fib);
	}
	public static void main(String[] args){
		
		FibonacciSeries FS =new FibonacciSeries();
		FS.fib();
		
		
		/*Scanner scn = new Scanner(System.in);
	    System.out.println("enter number to generate fibonacci series");
	    int num =scn.nextInt();
	    int fib1=1;
	    int fib2=1;
	    System.out.println("fibonacci series are:");
	    System.out.println(fib1);
	    System.out.println(fib2);
	    for(int i=2;i<num;i++){
	    	int fib3=fib1+fib2;
	    	 System.out.println(fib3);
	    	 fib1=fib2;
	    	 fib2=fib3;
	    	 }*/
	    
	    		
	}

}
