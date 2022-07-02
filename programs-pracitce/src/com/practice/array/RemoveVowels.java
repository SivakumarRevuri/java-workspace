package com.practice.array;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sn= new Scanner(System.in);
		System.out.println("enter the sting ");
		String s=sn.nextLine();
		s=s.replaceAll("[a,e,i,o,u]","*");
		System.out.println(s);
		sn.close();
	}
}