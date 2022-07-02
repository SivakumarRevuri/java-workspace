package com.pgpractice.july15;

public class Pattern2 {

	public static void main(String[] args) {
		int n=6,f=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(f+" ");
				if(f==1){
					f=0;
				}else
					f=1;
			}
			System.out.println();
		}
	}
}
