package com.pgpractice.july17;

public class PascalTriangle {

	 public static void main(String args[])
		{
		    int n=5;
			
			for(int i=0;i<n;i++){
				for(int j=n; j>i; j--){
					System.out.print(" ");
				}
				int x=1;
				for(int k=0;k<=i;k++){
					 System.out.print(x+ " ");
	                 x = x * (i - k) / (k + 1);
				}
				System.out.println();
			}
		}
	}