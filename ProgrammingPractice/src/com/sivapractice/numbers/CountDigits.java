
package com.sivapractice.numbers;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int count=0;
		do{
			count++;
			n=n/10;
		}while(n!=0);
		System.out.println(count);			
	}
}