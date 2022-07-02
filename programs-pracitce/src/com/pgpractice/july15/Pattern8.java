package com.pgpractice.july15;

public class Pattern8 {
	public static void main(String[] args) {
		int n=6,st=1,sp=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
				int x=1;
				for(int k=1;k<2*i;k++){
					System.out.print(k);
					if(k%2==0){
						System.out.print("*");
					}else{
						System.out.println(x);
						x++;
					}
				}
				System.out.println();
			}
		}
	}
}


