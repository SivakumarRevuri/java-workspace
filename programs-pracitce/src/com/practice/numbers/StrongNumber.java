package com.practice.numbers;

import java.util.Scanner;

public class StrongNumber {
	public int factorial(int n){
		int  f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
	}

	public static void main(String[] args) {

		StrongNumber sn= new StrongNumber();
		Scanner s= new Scanner(System.in);
		System.out.println("enter the integer number");
		int x=s.nextInt();
		int rem=0,k=x;
		while(x!=0){
			int j=x%10;
			rem= rem+sn.factorial(j);
			x=x/10;
		}
		s.close();
		if(rem==k){
			System.out.println("given number is strong number");
		}else
			System.out.println("given number is not a strong number");
	}
}
