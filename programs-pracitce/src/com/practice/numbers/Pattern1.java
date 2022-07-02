package com.practice.numbers;

public class Pattern1 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<=n;i++){
			for(int j=0;j<=n;j++){
				if(i==0||i==n||j==0||j==n||(i==j)&&(i+j)==n){
					System.out.print("* ");
				}else
					System.out.print("   ");
			}
			System.out.println();
		}		
	}
}
