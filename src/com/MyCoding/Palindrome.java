package com.MyCoding;

public class Palindrome {
	public static void main(String[] args)
	{

		String str = "NAYAN";
		String revString = "";
		int endIndex = str.length()-1;
		for(int i=endIndex;i>=0;i--){
			revString = revString+str.charAt(i);
		}
		System.out.println("Reversed string is: " + revString);
		
		if(revString.equals(str))
		{
			System.out.println("The given string  " +str+ "  is palindrome");
		}
		else
		{
			System.out.println("The given string  " +str+ "  is  not a palindrome");
		}
	
		}

}
