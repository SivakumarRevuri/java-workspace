/*find the given number is palindrome or not*/

package com.pgpractice.june14;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int i=s.nextInt();
		int c= palin(i);
		if(i==c){
			System.out.println("given number is palindrome");
		}else
			System.out.println("given number is not palindrome");
	}

	private static int palin(int no) {
		int rev=0;
		while(no!=0){
			int r=no%10;
			rev=rev*10+r;
			no=no/10;			
		}
		return rev;
	}

}
