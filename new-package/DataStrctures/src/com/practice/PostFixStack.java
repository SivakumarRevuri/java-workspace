package com.practice;

import java.util.Scanner;

public class PostFixStack {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String s = "abc*d/+";
	Stack st = new Stack();
	for (int i = 0; i < s.length(); i++) {
	    char ch = s.charAt(i);
	    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
		System.out.println("enter " + ch + " value");
		st.push(scanner.nextDouble());
	    } else {
		double v1 = (double) st.pop();
		double v2 = (double) st.pop();
		switch (ch) {
		case '+':
		    st.push(v1 + v2);

		    break;
		case '*':
		    st.push(v1 * v2);
		    break;
		case '/':
		    st.push(v1 / v2);
		    break;
		case '-':
		    st.push(v1 - v2);
		    break;
		case '%':
		    st.push(v1 % v2);
		    break;
		default:
		    break;
		}
		System.out.println("enter value :" + st.pop());
	    }
	}
	scanner.close();

    }
}
