package com.practice.string;

import java.util.Scanner;

public class ConvertToLowerCase {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
	String st = s.nextLine();

	char[] ch = st.toCharArray();
	for (int i = 0; i < ch.length; i++) {
	    if (ch[i] >= 65 && ch[i] <= 90) {
		ch[i] = (char) (ch[i] + 32);
	    }
	    System.out.print(ch[i] + "  ");
	}
	s.close();
    }
}
