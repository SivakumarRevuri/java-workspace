// w a j p to find arithmetic operations of given numbers
package com.pgpractice.july08;
import java.util.Scanner;
public class ArithmeticOper {
	public static void main(String[] args) {
		System.out.println("enter the numbers");
		Scanner s= new Scanner(System.in);
		int i=s.nextInt();
		int j= s.nextInt();
		System.out.println("sum of given numbers in "+(i+j));
		System.out.println("substract of given numbers in "+(i-j));
		System.out.println("product of given numbers in "+(i*j));
		System.out.println("division of given numbers in "+(i/j));
		System.out.println("remainder of given numbers in "+(i%j));
	}
}
