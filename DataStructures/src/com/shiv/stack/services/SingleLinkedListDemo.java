package com.shiv.stack.services;

public class SingleLinkedListDemo {

	Node first;
	Node last;

	class Node {
		int value;
		Node ref;
	}

	public boolean addElement(int value) {
		Node node = new Node();
		node.value = value;

		if (this.first == null)
			first = node;
		else
			last.ref = node;
		last = node;

		return false;
	}
}
