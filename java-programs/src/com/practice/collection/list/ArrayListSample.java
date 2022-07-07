package com.practice.collection.list;

import java.util.Arrays;
import java.util.List;

public class ArrayListSample {

	public static void main(String args[]) {

		List<String> obj = Arrays.asList("Ajeet", "Harry", "Chaitanya", "Steve", "Anuj");

		/* Displaying array list elements */
		System.out.println(obj.size());
		System.out.println("Currently the array list has following elements:"+obj);

		/*Add element at the given index*/
		obj.add(0, "Rahul");
		obj.add(1, "Justin");
		System.out.println(obj.size());
		/*Remove elements from array list*/
		obj.remove("Chaitanya");
		obj.remove("Harry");
		System.out.println(obj.size());
		System.out.println("Current array list is:"+obj);

		/*Remove element from the given index*/
		obj.remove(1);
		System.out.println(obj.size());

		System.out.println("Current array list is:"+obj);
	}
}
