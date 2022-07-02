package com.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class FindingTheFirstAndLastIndex {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the size of the Array");
	// size of the array
	int size = scanner.nextInt();
	// array creation.
	int[] array = new int[size];
	// elements in the array
	System.out.println("Please enter the array elements: ");
	for (int i = 0; i < size; i++) {
	    array[i] = scanner.nextInt();
	}
	// element to find
	System.out.println("Please enter the number to find in the array");
	int element = scanner.nextInt();
	searchArrayElement(array, element);
	scanner.close();
    }

    private static void searchArrayElement(int[] array, int element) {
	int firstIndex = -1;
	int lastIndex = -1;
	// sort the array
	Arrays.sort(array);
	for (int index = 0; index < array.length; index++) {
	    if (array[index] == element) {
		if (firstIndex < 0) {
		    firstIndex = index;
		}
		if (array[index] == element && array[index-1] == element) {
		    lastIndex = index;
		}
	    }
	}
	System.out.println(firstIndex+", "+lastIndex);
    }
}
