// w a j p to find given number is EvenOrOddWithOutIfcon 

package com.pgpractice.july04;

import java.util.Scanner;

public class EvenOrOddWithOutIfcon {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int i=s.nextInt();
		/*
		 * 	int a=67;
		 * int b=069; // error because any number start with 0 means it is octal number then it accept from 0 to 7 only it won't accept 8 and 9 
		 * int c=067;
		 * int d=072;
		 * int e=089; // error because any number start with 0 means it is octal number then it accept from 0 to 7 only it won't accept 8 and 9 
		 * 
		 */		
		String st[] ={"even","odd"};
		System.out.println(i+ " is " +st[i&1]+"number" );
		s.close();
	}

}
