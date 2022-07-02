
// w a j p to convert to decimal number to hexadecimal

package com.pgpractice.july08;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int i=s.nextInt();
		String bin=" ";
		while(i!=0){
			int j=i%16;
			i=i/16;
			if(j==10)
				System.out.println("a");
			if(j==11)
				System.out.println("b");
			if(j==12)
				System.out.println("c");
			if(j==13)
				System.out.println("d");
			if(j==14)
				System.out.println("e");
			if(j==15)
				System.out.println("f");

			bin= j+bin;
			System.out.println(bin);
		}
		//System.out.printf("%x",i);
	}
}
