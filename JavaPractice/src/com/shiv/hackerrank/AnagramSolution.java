package com.shiv.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramSolution {

    static boolean isAnagram(String a, String b) {
        char[] c1 = a.toLowerCase().toCharArray();
        char[] c2 = b.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        if (new String(c1).equals(new String(c2))) {
			return true;
		}
        return false;
    }

  public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}