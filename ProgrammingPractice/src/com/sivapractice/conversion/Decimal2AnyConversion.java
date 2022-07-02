package com.sivapractice.conversion;

import java.util.Scanner;

public class Decimal2AnyConversion {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number ");
		int i=s.nextInt();
		System.out.println("binary enter 2");
		System.out.println("octal enter 8");
		System.out.println("decimal enter 10");
		System.out.println("hexa decima enter 16");
		System.out.println("which conversion you need ");
		
		int j=s.nextInt();
		String st=	conversion(i,j);
		System.out.println(st);
	}
	private static String conversion(int i,int j) {
		String con="";
		while (i!=0) {
			int r=i%j;
			if (r<10) {
				con=r+con;
			}else
				con=(char)(r+55)+con;
			i=i/j;
		}
		return con;
	}
}
