package com.pgpractice.july17.assign;

public class PatternK {
	public static void main(String[] args) {
		int n=5;
		for (int i=0;i<n;i++){
			for(int j=n/2;j<n;j++){
				if(j==n/2||(i+j)==n-1||i==j){
					System.out.print("* ");
				}else 
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}
