package com.practice.string;
import java.util.Scanner;

public class CountNoOfWords {
	
	static void countWords(String a){
		char[] ch=a.toCharArray();
		int wc=0;
		for (int i = 0; i < ch.length; i++) {
			if (i==0&&ch[i]!=' '|| ch[i]!=' '&&ch[i-1]==' ') {
				wc++;
			}
		}
		System.out.println("no of words present in the given string: "+wc);
	}

public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the line");
	String st=s.nextLine();
	
	countWords(st);
	s.close();
}
}