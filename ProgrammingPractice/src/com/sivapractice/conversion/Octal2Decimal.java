package com.sivapractice.conversion;

import java.util.Scanner;

public class Octal2Decimal {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the decimalnumber");
		int i= s.nextInt();
		System.out.println("enter the conversion number");
		int j=s.nextInt();
		String res=oct2Binary(i,j);
		System.out.println(res);
		s.close();
	}

	 static String oct2Binary(int m,int n) {
		 String con=" ";
		 while(m!=0){
			 int j=m%n;
			 con=j+con;
			 m=m/n;
		 }	 
		return con;
	}
}
