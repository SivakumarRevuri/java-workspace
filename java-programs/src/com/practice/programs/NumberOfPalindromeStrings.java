package com.practice.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfPalindromeStrings {

    public static void main(String args[]) throws IOException {
	BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(read.readLine());
	while (t-- > 0) {
	    String input[] = read.readLine().split(" ");
	    int n = Integer.parseInt(input[0]);
	    int k = Integer.parseInt(input[1]);
	    Solution ob = new Solution();
	    System.out.println(ob.palindromicStrings(n, k));
	}
    }

}

class Solution {

    public boolean checkPalindrome(String string) {
	boolean isPalindrome = Boolean.FALSE;
	if (string.equals(new StringBuilder(string).reverse().toString())) {
	    isPalindrome = Boolean.TRUE;
	}
	return isPalindrome;
    }

    int palindromicStrings(int N, int K) {
	String string = "abcdefghijklmnopqrstuvwxyz";
	String substring = string.substring(0, K);
	List<String> list = new ArrayList<String>();
	int count = 0;
	if (K == substring.length()) {
	    char[] arr1 = substring.toCharArray();
	    char[] arr2 = arr1;
	    for (char c : arr1) {
		list.add(String.valueOf(c));
	    }
	    for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
		    list.add(new StringBuilder(arr1[i] + "" + arr2[j]).toString());
//		    System.out.println(new StringBuilder(arr1[i] + "" + arr2[j]).toString());
		}
	    }
	}
	System.out.println(list);
	Set<String> set = new HashSet<String>(list);
	System.out.println(set);
	for (String str : set) {
	    if (checkPalindrome(str)) {
		set.add(str);
		System.out.println(str);
		count++;
	    }
	}
	return count;
    }
}