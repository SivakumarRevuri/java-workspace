//w a j p to display given number is even or odd


package com.practice.numbers;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value");
		int i= s.nextInt();
		if(i%2==0){
			System.out.println("given number is even");
		}else 
			System.out.println("given number is odd");
		s.close();
	}

}
