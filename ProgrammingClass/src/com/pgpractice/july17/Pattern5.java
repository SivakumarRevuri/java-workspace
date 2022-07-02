package com.pgpractice.july17;

public class Pattern5 {
	public static void main(String[] args) {
		int n=9;
		for (int i=0;i<n;i++){
			for(int j=n/2;j<n;j++){
				if(j==n/2|i==j||i+j==n-1||i==0){
					System.out.print("* ");
				}else 
					System.out.print("   ");
			}
			System.out.println();
		}
	}

}
