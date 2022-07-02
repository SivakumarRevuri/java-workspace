package com.practice.string;
import java.util.Scanner;

// w a j p to count how many upper case and lower case letter present in your sentence

public class CountUpperLowerCase {
	static void countLetters(String st){
		int uc=0,lc=0;
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			if(ch>=65||ch<=90&&ch>=97||ch<=121){
				if(ch>=65&&ch<=90){
					uc++;
				}else
					lc++;
			}
		}
		System.out.println("no of upper case letters: "+uc);
		System.out.println("no of lower case letters: "+lc);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String st=s.nextLine();
		CountUpperLowerCase.countLetters(st);
	}

}
