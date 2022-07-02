
// w a j p to convert decimal numbers to octal number

package com.pgpractice.july08;

import java.util.Scanner;

public class DecimalToOctal {
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int i=s.nextInt();
		String bin=" ";
		while(i!=0){
		int j=i%8;
		i=i/8;
		bin= j+bin;
		System.out.print(bin);
	}

}
}
