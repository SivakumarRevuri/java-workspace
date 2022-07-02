/* reverse the given number*/

package com.pgpractice.june14;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
			Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int  i=s.nextInt();
		
		int c= reverse(i);
		System.out.println("reverse number is "+c);
	}
	private static int reverse(int no) {
		int rev=0;
		while(no!=0){
			 int r=no%10;
			 rev=rev*10+r;
			 no=no/10;			
		}
		return rev;
	}

}