/* WAP to find the no of digits in a given number*/

package com.practice.numbers;

import java.util.Scanner;

public class NoOfDigits {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);	
		System.out.println("enter the number ");
		int i=s.nextInt();
		int c= digits(i);
		System.out.println("number of digits in given number is "+c);
	}

	private static int digits(int i) {
		int c=0;
		do{
			c++;
			i=i/10;
		}while(i!=0);
		return c;
	}

}
