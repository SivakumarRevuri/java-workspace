
// w a j p to find given number  EvenOrOddWithoutModulus


package com.practice.numbers;

import java.util.Scanner;

public class EvenOrOddWithoutArithmeticOper {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		if((n&1)==0){
			System.out.println(n+"is EVEN");

		}else 
			System.out.println(n+"is ODD");
		s.close();
	}

}
