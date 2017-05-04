package com.MyCoding;

public class ArrayAddUpToTargetNumber {

	public static void main(String[] args) {
		int[] a1 ={7, 4, 10, -6, -2, 13, 2, 0, 17, 9, 6, 15, -4};
		int num = 13;
		for(int i=0;i<a1.length;i++){
			for(int j=i+1;j<a1.length;j++){
				if((a1[i]+a1[j])== num){
					System.out.println("("+ a1[i] +"," + a1[j] +")");
				}
				/*else{
					System.out.println();
				}*/
			}
			
		}
		
	}

}
