
// w a j p to swap 2 numbers

package com.pgpractice.july08;

import java.util.Scanner;

public class SwapOf2Num {

	public static void main(String[] args) {
		System.out.println("enter the i and j values");
		Scanner s= new Scanner(System.in);
		int i= s.nextInt();
		int j=s.nextInt();
		int temp=i;
		i=j;
		j=temp;
		System.out.println("after swaping  i value "+i+" j value "+j);
		System.out.println();

	}
}
