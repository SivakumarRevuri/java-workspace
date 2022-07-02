package com.practice.array;

import java.util.Scanner;

public class InsertingElement {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] a = readArray();
	System.out.println("index of the element");
	int n = s.nextInt();
	System.out.println("the element to be inserted ");
	int ele = s.nextInt();
	int[] c = insertingElement(a, ele, n);
	display(c);
	s.close();
    }

    static void display(int[] c) {
	for (int i = 0; i < c.length; i++) {

	    System.out.print(c[i] + "  ");
	}
	System.out.println();
    }

    static int[] insertingElement(int[] a, int ele, int n) {
	int[] res = new int[a.length];

	for (int i = 0; i < a.length; i++) {
	    if (n < 0 || n > a.length) {
		return null;
	    }
	    if (n < a.length) {
		res[i] = a[i];
	    } else
		res[i + 1] = a[i];
	}
	res[n] = ele;
	return res;
    }

    private static int[] readArray() {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n = s.nextInt();
	System.out.println("enter the array elements");
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
	    a[i] = s.nextInt();
	}
	s.close();
	return a;
    }
}
