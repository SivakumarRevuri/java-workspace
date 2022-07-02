package com.classby.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListSample1 {

	public static void main(String[] args) 
	{		
		ArrayList<String> lst=new ArrayList<String>();

		lst.add("siva");
		lst.add("kumar");
		lst.add("revuri");
		lst.add("pavan");
		lst.add("kumar");
		lst.add("lakshmi");
		lst.add("devi");

		System.out.println(lst);

		for (String st : lst) {
			System.out.println(st+"   ");
		}
		LinkedList<String> lkl= new LinkedList<String>();
		lkl.add("siva");
		lkl.add("kumar");
		lkl.add("pavan");
		lkl.add("kumar");
	//	lkl.addAll(lst);
		System.out.println();
		System.out.println("linked list data ");
		System.out.println(lkl);
		
	}
}
