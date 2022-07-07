package com.practice.string;

import java.util.Scanner;

public class Interchanging1stAndLastCharInWord {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the sentence");
	String st = s.nextLine();
	char[] ch = st.toCharArray();
	for (int i = 0; i < ch.length; i++) {

	    int sin = i;
	    while (i < ch.length && ch[i] != ' ') {
		i++;
	    }
	    char c = ch[sin];
	    ch[sin] = ch[i - 1];
	    ch[i - 1] = c;
	}
	st = new String(ch);
	System.out.println(st);
	s.close();
    }
}