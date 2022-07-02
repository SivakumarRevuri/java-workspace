
// w a  j p to convert the decimal number into binary number 

package com.pgpractice.july08;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
			String bin=" ";
			int i=a;
			while(i!=0){
			int j=i%2;
			i=i/2;
			bin= j+bin;
			System.out.print(bin);
			}
		}
	}