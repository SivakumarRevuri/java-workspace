
// w a j p to print hello along with name

package com.pgpractice.july08;

import java.util.Scanner;

public class PrintTheStatement {

	String name;	
	public static void main(String[] args) {
		System.out.println("enter the name");
		Scanner s= new Scanner(System.in);
		PrintTheStatement p = new PrintTheStatement();
		p.name=s.nextLine();
		System.out.println(" Hello "+p.name);
	}
}