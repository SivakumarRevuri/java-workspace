package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StringExample {

    public static void main(String[] args) {

	// take input from user
	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter the input String: ");
	String string = scanner.nextLine();

//	    1. Count the number of words that are present in the string
	wordCount(string);

//	    2. Count the number of words that appear more than once
	duplicateWords(string);
	scanner.close();
    }

    private static void wordCount(String string) {
	String array[] = splitArray(string);
	System.out.println("the no of words is: " + array.length);
    }

    private static String[] splitArray(String string) {
	return string.split(" ");
    }

    private static void duplicateWords(String string) {
	String array[] = splitArray(string);
	List<String> list = Arrays.asList(array);
	Set<String> set = new HashSet<String>();
	for (int i = 0; i < array.length; i++) {
	    if (Collections.frequency(list, array[i]) > 1) {
		set.add(array[i]);
	    }
	}
    }

}
