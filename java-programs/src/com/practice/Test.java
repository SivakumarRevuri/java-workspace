package com.practice;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
	String name = "Sivakumar";
	char[] array = name.toCharArray();
	Set< Character> set = new HashSet<Character>();
	for (char character : array) {
	    set.add(character);
	}
	System.out.println(set);
    }
}
