package com.practice.string;

import java.util.Scanner;

public class RemoveMoreThan1Space {

    void removeSpace(int[] a) {

    }

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the string");
	String st = s.nextLine();

	char[] ch = st.toCharArray();
	int count = 0;
	for (int i = 0; i < ch.length; i++) {
	    if (ch[i] == 32) {
		count++;
		if (count == 2) {
		    ch[i] = ch[i + 1];
		}
	    } else
		ch[i] = ch[i];
	    System.out.print(ch[i]);
	}
	s.close();
    }
}
