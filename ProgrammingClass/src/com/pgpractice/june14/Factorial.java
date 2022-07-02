package com.pgpractice.june14;

import java.util.Scanner;

public class Factorial {
 public static void main(String[] args) {
	System.out.println("enter the nuber");
	Scanner s= new Scanner(System.in);
	int i= s.nextInt();
	int f=sumOfDigits(i);
	System.out.println("the factorial of given number "+f);
}
private static int sumOfDigits(int y) {

	int a=0;
	do{
		int r=y%10;
		a=a+fact(r);
		y=y/10;
	}while(y!=0);	
	return a;
}
private static int fact(int x) {
	 int fc=1;
	 while(x>1){
		 fc=fc*x;
		 x--;
	 }	
	return fc;
}
}
