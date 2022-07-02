package com.practice.string;
import java.util.Scanner;

public class SplitStringBySpace {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the String: ");
	String input = scanner.nextLine();
	
	// split the string using space
	String array[] = input.split(" ");
	// Iterating the String by trimming the leading and trailing edges.
	// And reverse the String.
	for (String string : array) {
	    System.out.println(new StringBuilder(string.trim()).reverse());
	}
	
	scanner.close();
    }
}
