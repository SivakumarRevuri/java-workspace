package com.practice.numbers;

public class ReserveNumber {

	public static void main(String[] args) {
		int n=32242,res=0;
		while(n!=0){
		int j=n%10;
		res=res*10+j;
		n=n/10;
		}
		System.out.println("reverse of a given number: "+res);
	}
}
