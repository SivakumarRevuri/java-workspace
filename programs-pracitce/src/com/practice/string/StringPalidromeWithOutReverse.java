package com.practice.string;
import java.util.Scanner;

public class StringPalidromeWithOutReverse {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter the string ");
		String sg=s.nextLine();
		if (isPalindrome(sg)) 
			System.out.println("given string is palidrome");
		else
			System.out.println("given string is not palindrome ");
		s.close();
	}
	private static boolean isPalindrome(String st) {

		char[] ch=st.toCharArray();
	for (int i = 0; i < ch.length/2; i++) {
		if (ch[i]!=ch[ch.length-1-i]) {
			return false;
		}
	}
			return true;
	}
}

