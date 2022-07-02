package com.pgpractice.june21;

import java.util.Scanner;

public class Caldummy {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	int j= s.nextInt();	
	void cal() {
		adding(i,j);
		subs(i,j);
		mul(i,j);
		div(i,j);
	}
	int adding(int m,int n) {
		int res=(m+n);
		System.out.println("addition "+res);
		return res;
	}
	int subs(int m, int n) {
		int res=(m-n);
		System.out.println("subtraction "+res);
		return res;
	}
	int mul(int m, int n) {	
		int res=(m*n);
		System.out.println("multiplication "+res);
		return res;

	}
	int div(int m, int n) {
		int res=(m/n);
		System.out.println("division "+res);
		return res;

	}	
	public static void main(String[] args) {
		System.out.println("enter the values");
		Calculator c= new Calculator();
		c.cal();	
	}
}

