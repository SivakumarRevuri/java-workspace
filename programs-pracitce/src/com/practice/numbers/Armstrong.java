package com.practice.numbers;

public class Armstrong {

	 

	public static void main(String[] args) {
		int c=0,n=153,temp;
		temp=n;
		while(n>0){
			int a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c){
			System.out.println("the given nmber is armstrong");
		}else
			System.out.println("not armstrong");
	}

}

