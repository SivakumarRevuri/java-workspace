
package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) {
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    	try {
    	    int T = Integer.parseInt(reader.readLine());
    	    while (T-- > 0) {
    		int N = Integer.parseInt(reader.readLine());
    		String string = reader.readLine();
    		String[] array = string.split(" ");
    		int[] arr = new int[N];
    		    for(int i=0; i<N; i++)
    		    {
    		        arr[i] = Integer.parseInt(array[i]);
    		    }
    		    for (int i = arr.length - 1; i > -1; i--) {
    		     System.out.print(arr[i]+" ");
    		    }
    		    System.out.println();
    	    }
    	} catch (IOException e) {
    	    e.printStackTrace();
    	} 
    	

    }
}