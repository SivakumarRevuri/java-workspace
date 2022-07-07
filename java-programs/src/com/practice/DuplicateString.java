package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DuplicateString {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the String: ");
	String string = scanner.next();
	System.out.println("Please enter the Size of Infinite String: ");
	long size = scanner.nextLong();
	System.out.println(new DuplicateString().solution(string, size));

	// if size is to long, then byUsingCollectionFreaquency return
	// java.lang.OutOfMemoryError: Java heap space
	StringBuilder builder = new StringBuilder(string);
	long builderSize = (long) builder.length();
	while (!(builderSize >= size)) {
	    builder.append(string);
	    builderSize += string.length();
	}
	String infiniteString = builder.toString().substring(0, (int) size);
	System.out.println(new DuplicateString().byUsingCollectionFreaquency(infiniteString));
	scanner.close();
    }

    private int byUsingCollectionFreaquency(String string) {
	List<Character> list = new ArrayList<Character>();
	char[] charArray = string.toCharArray();
	for (char c : charArray) {
	    list.add(c);
	}
	char character = string.charAt(0);
	int frequency = Collections.frequency(list, character);
	return frequency;
    }

    private long solution(String s, long n) {
	long size = s.length(), repeated = n / size;
	long left = n - (size * repeated);
	int extra = 0;

	int count = 0;
	for (int i = 0; i < size; i++) {
	    if (s.charAt(i) == 'a') {
		++count;
	    }
	}

	for (int i = 0; i < left; i++) {
	    if (s.charAt(i) == 'a') {
		++extra;
	    }
	}

	repeated = (repeated * count) + extra;

	return repeated;
    }
}
