package com.customexception;

import java.util.Scanner;

public class Money  
{

	public static void transfer() throws AmountExceedLimitException{

		Scanner s= new Scanner(System.in);
		System.out.println("enter the amount you wnat to transfer ");
		int amount=s.nextInt();
		if (amount<=100000) {
			System.out.println("the transfered money is:  "+amount);
		}else {
			System.out.println("transfer amount exceded, you can transfer below 1 lakh");
		}
		s.close();
	}
}
