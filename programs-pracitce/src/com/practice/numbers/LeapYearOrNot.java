

// w a j p check entered year is leap year or not


package com.practice.numbers;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int y=s.nextInt();
		if((y%400)==0)                
			System.out.println("given year is leap year");
		else if(y%4==0){
			if (y%100!=0)
				System.out.println("given year is  leap year");
		}else 
			System.out.println("given year is not leap year");

		// if (y%400==0 || y%4==0&& y%100!=0)


		s.close();
	}

}