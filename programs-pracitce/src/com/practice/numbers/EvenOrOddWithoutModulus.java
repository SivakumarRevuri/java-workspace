package com.practice.numbers;

import java.util.Scanner;

public class EvenOrOddWithoutModulus {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int i=s.nextInt();
		if((i/2)*2==i){
			System.out.println(i+" is EVEN");
		}else
			System.out.println(i+" is odd");
		s.close();
	}

}
