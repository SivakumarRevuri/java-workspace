package com.pgpractice.june14;

import java.util.Scanner;

public class EqualDigitsOrNot {
	public static void main(String[] args) {
		System.out.println("enter the numbers");
		Scanner s= new Scanner(System.in);
		int i= s.nextInt();
		int j=s.nextInt();
		int n1=numberOfDigits(i);
		int n2= numberOfDigits(j);
		if(n1==n2){
			System.out.println("the number of digits equal");
		}else 
			System.out.println("the no of digits not equal");
	}
	private static int numberOfDigits(int x ) {
		int no=0;
		do{
			no++;
			x=x/10;
		}while(x!=0);
		return no;
	}

}
