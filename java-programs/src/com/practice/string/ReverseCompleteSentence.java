package com.practice.string;

import java.util.Scanner;

public class ReverseCompleteSentence {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the sentence");
	String st = s.nextLine();
	char[] ch = st.toCharArray();
	st = "";
	for (int i = ch.length - 1; i >= 0; i--) {
	    int lin = i;
	    while (i >= 0 && ch[i] != ' ') {
		i--;
	    }
	    int j = i + 1;
	    while (j <= lin) {
		st = st + ch[j];
		j++;
	    }
	    if (i > 0)
		st = st + ch[i];
	}
	System.out.print(st);
	s.close();
    }
}
