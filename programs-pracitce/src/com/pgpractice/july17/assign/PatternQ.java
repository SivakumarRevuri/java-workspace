package com.pgpractice.july17.assign;

public class PatternQ {

	public static void main(String[] args) {
		int n=9;
		for (int i=0;i<n;i++){
			for(int j=0;j<=n/2;j++){
				if(i==j&&i>=n/2||(i==0||i==(3*n)/4)&&j<=(3*n)/4||(j==0||j==(3*n)/4)&&i<=(3*n)/4){
					System.out.print("* ");
				}else 
					System.out.print("   ");
			}
			System.out.println();
		}
	}
}