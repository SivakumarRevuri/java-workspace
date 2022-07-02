
// w a j p to define a method to return the n the fibonaci series number(display nth term only )

package com.pgpractice.july14;

import java.util.Scanner;

public class FibnaciDisplaynthTerm {
	
	int fibmeth(int n){
		int f1=0, f2=1,c=1;
		while(n>0){
			if(c==n){
				return f1;
			}
			System.out.println(c);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			c++;		
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		FibonaciNum f= new FibonaciNum();
		f.fibmeth(n);
	}
}