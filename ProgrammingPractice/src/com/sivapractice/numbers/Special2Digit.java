package com.sivapractice.numbers;

import java.util.Scanner;

public class Special2Digit {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the 2 digit number");
		int n=s.nextInt();
		int temp=n;
		int count=0;
		while(n!=0){
			count++;
			n=n/10;

		}if(count==2){
			System.out.println("given number is 2 digit number");
		}else
			System.out.println("is not a 2 digit number ");
		int z=temp,res=0;
		while(n!=0){
			int j=n%10;
			res=res*10+j;
			n=n/10;
		}
		if(res==z){
			System.out.println(z+" is a special 2 digit number ");
		}else
			System.out.println(z+" is not a special 2 digit number");
	}
}
