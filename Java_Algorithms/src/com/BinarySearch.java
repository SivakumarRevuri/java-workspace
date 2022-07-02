package com;

import java.util.Arrays;

/*binarySearch works with Sorted Array
 * array[] = {1,3,5,8,11,16,23}
 *  findElement(int x, int low, int high, int array[]) {
	 *  
	 *  int searchElement = 8;
	 *  low = 0 ; high = array.length-1;
	 * mid = (low+high)/2;
	 * if(x == array[mid]){
	 * 	System.out.println("The element found at index: "+mid);
	 * 	return true;
	 * }else if(x < array[mid]){
	 * 	low = 0, high = mid -1;
	 *  	findElement(searchElement, low, high, array);
 * } 
 *   */
public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 1, 3, 5, 8, 11, 16, 23 };
		int element = 3;
		// sortArray(array);
		findElement(array, element, 0, array.length - 1);
		Arrays.binarySearch(array, element);
	}

	private static boolean findElement(int[] array, int element, int low, int high) {
		int mid = (low + high) / 2;
		while (low <= high) {

			if (element == array[mid]) {
				System.out.println("The element found at index: " + mid);
				return true;
			} else if (element < array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high) / 2;
		}
		return false;
	}

}
