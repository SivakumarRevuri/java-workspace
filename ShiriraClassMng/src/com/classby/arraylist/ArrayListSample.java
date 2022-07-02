package com.classby.arraylist;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String args[]) {

		ArrayList<String> obj = new ArrayList<String>();


		/*This is how elements should be added to the array list*/
		obj.add("Ajeet");
		obj.add("Harry");
		obj.add("Chaitanya");
		obj.add("Steve");
		obj.add("Anuj");

		/* Displaying array list elements */
		System.out.println(obj.size());
		System.out.println("Currently the array list has following elements:"+obj);

		/*Add element at the given index*/
		obj.add(0, "Rahul");
		obj.add(1, "Justin");
		System.out.println(obj.size());
		/*Remove elements from array list like this*/
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
