
//  w a j p to check your number is special 2 digit number or not 


package com.practice.numbers;

import java.util.Scanner;

public class Special2Digit {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the 2 digit number");
	int i= s.nextInt();
	if(i>9&&i<100){
		int j=i%10;
		int k=i/10;
		if((j+k)+(j*k)==i){
			System.out.println(i+" is special 2 digit number" );
		}else
			System.out.println(i+ " is not special 2 digit number ");
	}else
		System.out.println(i+ "  is not 2 digit number " );
	s.close();			
}
	
}