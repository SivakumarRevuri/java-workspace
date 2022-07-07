package com.practice.string;

import java.util.Scanner;

public class StringAbbrivation {
    static void countWords(String a) {
	char[] ch = a.toCharArray();
	int wc = 0;
	String st = " ";
	for (int i = 0; i < ch.length; i++) {
	    if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')// first character of the word
	    {
		if (ch[i] >= 97 && ch[i] <= 122) {
		    st = st + (char) (ch[i] - 32);
		} else
		    st = st + ch[i];
		wc++;
	    }
	}
	System.out.println("no of words present in the given string: " + wc);
	System.out.println("abbrivation of given string is: " + st);
    }

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the line");
	String st = s.nextLine();
	s.close();
	countWords(st);
    }
}
