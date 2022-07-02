package com.practice.numbers;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the interger number");
		int i=s.nextInt();
		int r=0;
		int temp=i;
		while(i!=0){
			int j=i%10;
			r=r+j*j*j;
			i=i/10;
		}
		if(r==temp){
			System.out.println(temp+"  is a armstrong number ");
		}else
			System.out.println(temp+ "  is not armstrong number");
	}
}
