
// w a j p to print fibonaci series  from 1 to n........
package com.pgpractice.july14;

import java.util.Scanner;

public class FibonaciNum {
	void fibmeth(int n){
		int f1=0, f2=1;
		while(n>0){
			System.out.println(f1);
			int f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;		
		}
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		FibonaciNum f= new FibonaciNum();
		f.fibmeth(n);
	}

}
