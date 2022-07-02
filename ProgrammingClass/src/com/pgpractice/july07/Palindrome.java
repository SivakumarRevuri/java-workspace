
// w a j p to print the Palindrome numbers between 1 to 1000

package com.pgpractice.july07;

import java.util.Scanner;

public class Palindrome {
	static int  reverse(int n) {
		int rev=0;
		while(n!=0){
			int r=n%10;
			rev= rev*10+r;
			n=n/10;	
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		for ( int i=1;i<=1000;i++){
			if (i==reverse(i)){
				System.out.println(i+" is palindrome");
			}
		}
		s.close();
	}

	 
}
