package com.practice.string;

// w a j p to find the sum of the digits in the string

import java.util.Scanner;

public class SumOfDigitsInString {
    static void sumOfDigits(String st) {
	int sum = 0;
	for (int i = 0; i < st.length(); i++) {
	    char ch = st.charAt(i);
	    if (ch >= 48 && ch <= 57) // 48 ascii of 0 and 57 for 9
	    {
		sum = sum + (ch - 48);
	    }
	}
	System.out.println("sum of the digits: " + sum);

    }

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
	String st = s.nextLine();
	SumOfDigitsInString.sumOfDigits(st);
	s.close();
    }

}