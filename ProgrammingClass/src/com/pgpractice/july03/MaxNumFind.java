// w a j p to find max number among given numbers 

package com.pgpractice.july03;

import java.util.Scanner;

public class MaxNumFind {
	private void check(int i, int j, int k) {
		if (i>=j&&i>=k){
			System.out.println("maxium number is " + i);
		}else if (j>=k){
			System.out.println("maximun number is "+ j);
		}else 
			System.out.println("maximum number is "+k);

	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter i value");
		int i=s.nextInt();
		System.out.println("enter j value");
		int j=s.nextInt();
		System.out.println("enter k value");
		int k=s.nextInt();
		MaxNumFind m= new MaxNumFind();
		m.check(i, j , k);
		s.close();
	}

}
