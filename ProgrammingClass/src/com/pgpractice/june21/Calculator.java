package com.pgpractice.june21;

import java.util.Scanner;

public class Calculator {
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	int j= s.nextInt();	
 void cal() {
		adding();
		subs();
		mul();
		div();
	}
	 int adding() {
		int x=i;
		int y=j;
		int res=(x+y);
		System.out.println("addition "+res);
		return res;
	}
	int subs() {
		int x=i;
		int y=j;
		int res=(x-y);
		System.out.println("subtraction "+res);
		return res;
	}
	 int mul() {	
		int x=i;
		int y=j;
		int res=(x*y);
		System.out.println("multiplication "+res);
		return res;

	}
	private void div() {
		int x=i;
		int y=j;
		int res=(x/y);
		System.out.println("division "+res);

	}	
	public static void main(String[] args) {
		System.out.println("enter the values");
		Calculator c= new Calculator();
		c.cal();	
	}
}
