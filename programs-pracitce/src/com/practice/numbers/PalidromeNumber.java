package com.practice.numbers;

import java.util.Scanner;

public class PalidromeNumber {


	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the interger number");
		int i=s.nextInt();
		int sum=0;
		while(i>0){
			int j=i%10;
			sum=sum*10+j;
			i=i/10;
		}
		System.out.println(sum);
	}
}
