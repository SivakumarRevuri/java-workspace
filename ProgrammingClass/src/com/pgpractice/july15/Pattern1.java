package com.pgpractice.july15;
public class Pattern1 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}
}