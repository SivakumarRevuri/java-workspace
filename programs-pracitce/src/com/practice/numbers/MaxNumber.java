package com.practice.numbers;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter  3 numbers");
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		if(i<j&&i<k){
			if(j<k){
				System.out.println("maximum number is: "+k);
			}else
				System.out.println("maximum number is: "+j);
			
		}else if(i>k){
			System.out.println("maximum number is :" +i);
		}
		else 
			System.out.println("maximum number is: "+k);
	}	
}
