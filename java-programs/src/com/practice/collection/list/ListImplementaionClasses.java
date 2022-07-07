package com.practice.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListImplementaionClasses {

    public static void main(String[] args) {
	// ArrayList Implementation.
	ArrayList<String> arrayList = new ArrayList<String>();
	arrayList.add("siva");
	arrayList.add("kumar");
	arrayList.add("pavan");
	arrayList.add(null);
	arrayList.add("venkateswarulu");
	arrayList.add("lakshmi");
	arrayList.add("devi");

	System.out.println("array list size is: " + arrayList.size());
	// ArrayList iteration through forEach(Consumer<>)
	arrayList.forEach(string -> System.out.println(string));
	System.out.println("======================");

	// Linked List
	System.out.println("linked list ");

	LinkedList<String> linkedList = new ListImplementaionClasses().convertALtoLinkedList(arrayList);
	System.out.println("linked list size is: " + linkedList.size());
	// LinkedList iteration through forEach(Consumer<>)
	linkedList.forEach(string -> System.out.println(string));
    }

    public LinkedList<String> convertALtoLinkedList(List<String> arrayList) {
	/*
	 * Assigning the ArrayList elements to LinkedList by constructor argument.
	 * LinkedList<String> linkedList = new LinkedList<String>(arrayList);
	 */
	// Also convert the ArrayList to LinkedList using Stream A
	return arrayList.stream().collect(Collectors.toCollection(LinkedList::new));
    }
}
