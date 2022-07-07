package com.practice.string;

import java.util.Scanner;

public class CountCharactersInString {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
	String st = s.nextLine();

	char[] ch = st.toCharArray();
	int count = 0;
	for (int i = 0; i < ch.length; i++) {
	    count++;
	}
	System.out.println(count);
	s.close();
    }
}
