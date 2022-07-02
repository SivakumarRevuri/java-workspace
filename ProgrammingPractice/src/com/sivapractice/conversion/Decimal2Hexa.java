package com.sivapractice.conversion;

import java.util.Scanner;

public class Decimal2Hexa {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the decimal number");
		int i=s.nextInt();
		System.out.println("conversion number");
		int j=s.nextInt();
		String res=dec2Octal(i,j);
		System.out.println(res);
		s.close();
	}

	static String dec2Octal(int m,int n) {
		String sum=" ";
		while(m!=0){
			int o=m%n;

			if(o<10){ 
				sum=o+sum;
			}else
				sum=(char)(o+55)+sum;
			m=m/n;
		}
		return sum;
	}
}

