package com.practice.string;

import java.util.Scanner;

public class StringPalindrome {
    
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the string ");
	String sg = s.nextLine();
	if (isPalindrome(sg))
	    System.out.println("given string is palidrome");
	else
	    System.out.println("given string is not palindrome ");
	s.close();
    }

    private static boolean isPalindrome(String st) {

	char[] ch = st.toCharArray();
	String sn = st;
	st = "";
	for (int i = ch.length - 1; i >= 0; i--) {
	    st = st + ch[i];
	}
	if (st.equals(sn)) {
	    return true;
	} else
	    return false;
    }
}
